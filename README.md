# Hindi Doc Maker (Android)

Type a topic → the app writes a Hindi documentary script, makes a Hindi voiceover and an AI picture for every scene, then renders a full video (zoom/pan motion, crossfades, Hindi subtitles, title card, optional background music) right on your phone. Save it or share straight to YouTube.

## Get the APK (free, no PC needed)
1. On GitHub create a new repo, e.g. `hindi-doc-maker`.
2. Upload everything in this folder (keep the `.github` folder!).
3. Open the repo → **Actions** tab → "Build Android APK" runs automatically (≈5 min).
4. Open the finished run → download **HindiDocMaker-apk** → unzip → install `app-debug.apk` (allow "install unknown apps").

## First use
1. Get a Gemini API key at aistudio.google.com → Get API key (enable billing for voice + images).
2. Open the app → ⚙️ Settings → paste key → Save.
3. Step 1: enter topic + length → **Write script** → edit any scene if you like.
4. Step 2: **Generate voice & images** → redo any picture/voice you don't like.
5. Step 3: **Render video** → **Save / Share**.

## Cost tips
- Script + voice are cheap; pictures are the main cost (one per scene, ~22 sec each).
- Set *Image source* to **Pollinations (free)** to pay nothing for pictures.

## Notes
- Rendering is real time: a 10-min video takes ~10 min. Keep the app in front.
- Output is MP4 on most new phones, otherwise WebM (YouTube accepts both).
- If Google renames a model, change it in Settings — no new APK needed.
- To change the app, edit `www/index.html` and push; a new APK builds automatically.
