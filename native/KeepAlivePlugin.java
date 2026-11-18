package in.gaonkar.hindidocmaker;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

/** JS: Capacitor.Plugins.KeepAlive.busy({on:true|false}) */
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
            call.resolve();
        } catch (Exception e) {
            call.reject(e.getMessage());
        }
    }
}
