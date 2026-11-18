package in.gaonkar.hindidocmaker;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

/** JS: Capacitor.Plugins.KeepAlive.busy({on}), .status(), .openSettings() */
@CapacitorPlugin(name = "KeepAlive")
public class KeepAlivePlugin extends Plugin {
    @PluginMethod
    public void busy(PluginCall call) {
        Boolean on = call.getBoolean("on", false);
        Activity a = getActivity();
        Intent i = new Intent(a, KeepAliveService.class);
        try {
            if (on != null && on) {
                if (Build.VERSION.SDK_INT >= 26) a.startForegroundService(i); else a.startService(i);
            } else {
                a.stopService(i);
            }
            JSObject r = new JSObject();
            r.put("ok", true);
            r.put("notifications", notificationsOn());
            call.resolve(r);
        } catch (Exception e) {
            call.reject(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @PluginMethod
    public void status(PluginCall call) {
        JSObject r = new JSObject();
        r.put("notifications", notificationsOn());
        r.put("android", Build.VERSION.SDK_INT);
        r.put("running", KeepAliveService.running);
        r.put("error", KeepAliveService.lastError);
        call.resolve(r);
    }

    @PluginMethod
    public void openSettings(PluginCall call) {
        Activity a = getActivity();
        try {
            Intent i;
            if (Build.VERSION.SDK_INT >= 26) {
                i = new Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS);
                i.putExtra(Settings.EXTRA_APP_PACKAGE, a.getPackageName());
            } else {
                i = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + a.getPackageName()));
            }
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            a.startActivity(i);
            call.resolve();
        } catch (Exception e) {
            call.reject(e.getMessage());
        }
    }

    private boolean notificationsOn() {
        NotificationManager nm = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        return nm != null && (Build.VERSION.SDK_INT < 24 || nm.areNotificationsEnabled());
    }
}
