# Hindi Doc Maker v2 (Android)

One tap: **topic → finished Hindi documentary video**, using real AI tools for each job:

| Job | Tool |
|---|---|
| Script, title, description, tags | Google Gemini |
| Pictures (first frame of every shot) | Google Gemini image ("Nano Banana") |
| Hindi voiceover + exact subtitles | ElevenLabs (or Gemini voice) |
| Video clips (picture → moving shot) | Gemini Omni Flash (Flow's model) · xAI Grok Imagine · Kling AI |
| Final edit (clips + voice + subtitles + title + music) | Done on the phone |

Everything you pay for (voices, pictures, clips) is saved on the phone, so closing the app never loses paid work.

## Keys you need
- **Gemini** – aistudio.google.com/apikey → turn on billing (pictures and Omni video are not on the free tier).
- **ElevenLabs** – elevenlabs.io → Developers → API keys. Add a Hindi voice from the Voice Library, then tap "Load my voices" in the app.
- **Grok** (optional) – console.x.ai · **Kling** (optional) – app.klingai.com/global/dev

## Rough cost for a 3-minute video (20 clips)
- Omni Flash 720p ≈ $20 · 360p ≈ $7
- Grok 720p ≈ $14 · 480p ≈ $10
- Kling std ≈ $17–25
- Pictures ≈ $1.20 · Voice: ~2,700 characters from your ElevenLabs plan
- Cheaper: Settings → "AI video for" → every 2nd scene / first 3 scenes; the other scenes use pictures with camera motion.

The app shows a live estimate before you start.

## Build
Every push to `main` builds the APK in GitHub Actions → download **HindiDocMaker-apk**.

## ☁️ Cloud video bot (new in v5.3)
Let GitHub make the AI clips while your phone is locked. The bot lives in a separate repo, **doc-video-bot** (see its README for the 10-minute setup).
Then in the app: ⚙️ Settings → ☁️ Cloud video bot → GitHub token + repo → tap **☁️ Send to cloud bot**, later **⬇️ Get clips**.
**🆓 v5.4:** pick "My own model — Kaggle free GPU" as the bot engine to make clips at ₹0 with open-source LTX-Video or Wan 2.2.
