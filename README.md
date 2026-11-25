# Hindi Doc Maker v7 (Android)

**Topic → finished Hindi explainer video made of pictures.** One button. Indian topics, Hindi voiceover, English on-screen text.

## Smart script (v7.1)
1. **🔎 Research** — Gemini researches the topic with **Google Search** (needs billing on the key; 5,000 searches/month free) or, if that's not allowed, reads the full **Wikipedia** articles (English + Hindi). Sources go into the YouTube description.
2. **📹 From a video** — upload a video or paste a YouTube link: Gemini watches the whole thing, takes complete notes, then the script is written in your **own words** (never copies its lines).
3. **🧠 Plan** — picks the most gripping angle, 3 hooks → the best one, open loops, parts.
4. **✍️ Write** — modern spoken Hindi, every scene teaches something specific, Indian everyday comparisons, a twist every ~45 s.
5. **🧐 Editor** — scores every scene, rewrites weak ones, fact-checks against the research.
Optional: add a **Claude API key** for the best Hindi storytelling (Gemini is used for free otherwise).

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

## 🎥 Camera & transitions (v7.3)
- Smooth, constant-speed moves — one move per scene while pictures change underneath (no pulsing or shaking)
- Camera: Slow zoom (Ken Burns) · Follow the words · Slow pan · Mixed · No movement — speed Slow/Normal/Fast
- Transitions between pictures and between scenes: Cut, Crossfade, Zoom through, Slide, Whip pan, Flash, Dip to black, Blur
- Upload a video (Styles tab or "base it on a video") → Gemini studies its camera moves and transitions and sets them for you
- Change any scene's camera in 📝 Script & pictures · 👁️ Preview the first 15 seconds before rendering

## Camera that follows the voice (older notes)
- Words like *ऊपर / बढ़ा* → tilt up · *गिर / पतन* → tilt down · *अचानक / लेकिन* → zoom punch · *पूरा / विशाल* → pull out to reveal · *यात्रा / सफ़र* → pan · *युद्ध / भूकंप* → shake
- The most important word of each scene gets an extra zoom punch
- The picture "breathes" with the loudness of the voice
- Living-picture layer: gentle sway, floating dust / sparkles / fog / chalk dust, light flicker (per style)

## 🎬 Video file (v7.6)
- Built frame by frame as a real MP4 (Android's video encoder + mp4-muxer): correct length in the gallery and YouTube, no black first frame, doesn't need to play in real time
- First frame = title over the first picture; a separate **thumbnail** (1280×720 or 1080×1920) is saved to Pictures › HindiDocMaker for YouTube Studio
- Old live recorder is kept only as a fallback for phones without a video encoder

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
