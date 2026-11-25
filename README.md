# Hindi Doc Maker v7 (Android)

**Topic → finished Hindi explainer video made of pictures.** One button. Indian topics, Hindi voiceover, English on-screen text.

## How it works
| Step | Tool | Cost |
|---|---|---|
| ✍️ Script in modern spoken Hindi + English captions & YouTube text | Google Gemini (free key works) | ₹0 |
| 🎙️ Voiceover — voice picked automatically to suit the style | ElevenLabs (Multilingual v2 = fewest Hindi mistakes) | your plan |
| 🧠 Picture plan — one picture per 1/2/3 seconds of voice + camera move that matches the words | Gemini | ₹0 |
| 🖼️ Pictures | Pollinations (FLUX) → Cloudflare FLUX backup | ₹0 |
| 🎵 Background music — composed by the app for each style | built in | ₹0, copyright-free |
| 🎬 Render — camera motion, living-picture effects, on-screen text, captions | on the phone | ₹0 |

## 15 styles
Stickman · Comic action (original heroes) · 3D animated · Anime · Retro pixel game · Indian miniature · Madhubani folk art · Realistic photo · Cinematic film · Watercolour storybook · Claymation · Flat infographic · Vintage newspaper · Paper cut-out · Chalkboard sketch · Dark mystery

Each style sets the picture look, script tone, text design, music mood, voice type and effects.
**🎨 Styles tab → Learn a style:** pick 1–3 example videos (or YouTube links) and Gemini makes a new style from them.

## Camera that follows the voice
- Words like *ऊपर / बढ़ा* → tilt up · *गिर / पतन* → tilt down · *अचानक / लेकिन* → zoom punch · *पूरा / विशाल* → pull out to reveal · *यात्रा / सफ़र* → pan · *युद्ध / भूकंप* → shake
- The most important word of each scene gets an extra zoom punch
- The picture "breathes" with the loudness of the voice
- Living-picture layer: gentle sway, floating dust / sparkles / fog / chalk dust, light flicker (per style)

## Keys (⚙️ Settings)
- **Gemini** – aistudio.google.com/apikey
- **ElevenLabs** – elevenlabs.io → Developers → API keys. Tap **🔎 Find Hindi voices** to add native Hindi narrators.
- **Pollinations** (optional, free) – enter.pollinations.ai → removes watermark, ~3× faster
- **Cloudflare** (optional, free backup) – Account ID + Workers AI token
- Keys from older versions are carried over automatically.

## Time
A 5-minute video at 1 picture/second = ~300 pictures. Without a Pollinations key ≈ 80 min of picture making (≈ 40 min with Cloudflare added); with a key ≈ 15 min. You can minimise the app while pictures are made, pause any time and continue later — nothing is lost. Final rendering runs in real time with the app open.

## Build
Every push to `main` builds the APK in GitHub Actions → download **HindiDocMaker-apk**.
