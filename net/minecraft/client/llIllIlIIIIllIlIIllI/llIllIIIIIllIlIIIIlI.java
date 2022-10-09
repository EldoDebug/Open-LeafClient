package net.minecraft.client.llIllIlIIIIllIlIIllI;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("INVERT_MOUSE", 0, "options.invertMouse", false, true), 
    IlIlIlIlIlllllllllIl("SENSITIVITY", 1, "options.sensitivity", true, false), 
    llIllIIIIIllIlIIIIlI("FOV", 2, "options.fov", true, false, 30.0f, 110.0f, 1.0f), 
    IlIIIlIlIIIllIlIlIIl("GAMMA", 3, "options.gamma", true, false), 
    IlIlIIIllIllIIIIIllI("SATURATION", 4, "options.saturation", true, false), 
    IllIIlllIIIIlllIIlIl("RENDER_DISTANCE", 5, "options.renderDistance", true, false, 2.0f, 16.0f, 1.0f), 
    llllIIIlIlllIlIIIIIl("VIEW_BOBBING", 6, "options.viewBobbing", false, true), 
    lIIIIlIIIIIlllIllIII("ANAGLYPH", 7, "options.anaglyph", false, true), 
    lIIIlllIIIllIIIllIII("FRAMERATE_LIMIT", 8, "options.framerateLimit", true, false, 0.0f, 260.0f, 5.0f), 
    llIIlIIIlIIIllIlIIIl("FBO_ENABLE", 9, "options.fboEnable", false, true), 
    llIllIlIIIIllIlIIllI("RENDER_CLOUDS", 10, "options.renderClouds", false, false), 
    lIlIlIIIllIIllIIIllI("GRAPHICS", 11, "options.graphics", false, false), 
    IlIlIIIllIIllIlllllI("AMBIENT_OCCLUSION", 12, "options.ao", false, false), 
    IIIIlllIIIIIIlIIIlll("GUI_SCALE", 13, "options.guiScale", false, false), 
    llllIIllllIlIlIIIIll("PARTICLES", 14, "options.particles", false, false), 
    IlIllIlIlIIIlIlIlIII("CHAT_VISIBILITY", 15, "options.chat.visibility", false, false), 
    IIlllIIlIllIllIlIIll("CHAT_COLOR", 16, "options.chat.color", false, true), 
    lllIIIIlllllIlIIllIl("CHAT_LINKS", 17, "options.chat.links", false, true), 
    IlIlIIIIIIlllIlIllIl("CHAT_OPACITY", 18, "options.chat.opacity", true, false), 
    IIllIIllIIIlIlIIIIlI("CHAT_LINKS_PROMPT", 19, "options.chat.links.prompt", false, true), 
    IIIlIIIlIlIIlllIIlll("SNOOPER_ENABLED", 20, "options.snooper", false, true), 
    IlIlIIIlIIlIlIIlllIl("USE_FULLSCREEN", 21, "options.fullscreen", false, true), 
    IlllllllIIIlIIIlIlII("ENABLE_VSYNC", 22, "options.vsync", false, true), 
    IIlIIIIlllIlllllIlII("USE_VBO", 23, "options.vbo", false, true), 
    IIIlIIlIIIIlllIlllII("TOUCHSCREEN", 24, "options.touchscreen", false, true), 
    IlIlIllllllllIIIIlII("CHAT_SCALE", 25, "options.chat.scale", true, false), 
    IIlllIlIIllIlIlIlIIl("CHAT_WIDTH", 26, "options.chat.width", true, false), 
    llIIIlIlIllIIlIlIlII("CHAT_HEIGHT_FOCUSED", 27, "options.chat.height.focused", true, false), 
    lllllIlIIIlIlIIlllII("CHAT_HEIGHT_UNFOCUSED", 28, "options.chat.height.unfocused", true, false), 
    lIllllllIIllIlIlIlII("MIPMAP_LEVELS", 29, "options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f), 
    llIIlllIIlllIIllIllI("FORCE_UNICODE_FONT", 30, "options.forceUnicodeFont", false, true), 
    IIlllIIIlIlllIIlllII("STREAM_BYTES_PER_PIXEL", 31, "options.stream.bytesPerPixel", true, false), 
    IIlIIIIIllIlIIIlIIll("STREAM_VOLUME_MIC", 32, "options.stream.micVolumne", true, false), 
    llllllIllIllIlIllllI("STREAM_VOLUME_SYSTEM", 33, "options.stream.systemVolume", true, false), 
    IIIllllllIllIIIlllIl("STREAM_KBPS", 34, "options.stream.kbps", true, false), 
    IlIIIlIIIllllIlIlIlI("STREAM_FPS", 35, "options.stream.fps", true, false), 
    IIIIIllIIIIlIIIIllIl("STREAM_COMPRESSION", 36, "options.stream.compression", false, false), 
    IIIIIIIIIlllIllIlIlI("STREAM_SEND_METADATA", 37, "options.stream.sendMetadata", false, true), 
    IIllllIIIlIIIIIIllIl("STREAM_CHAT_ENABLED", 38, "options.stream.chat.enabled", false, false), 
    IlllIIIIlIIIlIlIlIIl("STREAM_CHAT_USER_FILTER", 39, "options.stream.chat.userFilter", false, false), 
    lllIllIIIllllllIllll("STREAM_MIC_TOGGLE_BEHAVIOR", 40, "options.stream.micToggleBehavior", false, false), 
    llIllIlIlIIIIIIIllII("BLOCK_ALTERNATIVES", 41, "options.blockAlternatives", false, true), 
    IIlIlIlIIlIllIIIIIIl("REDUCED_DEBUG_INFO", 42, "options.reducedDebugInfo", false, true), 
    IllIllIIIIlIIlIlllII("ENTITY_SHADOWS", 43, "options.entityShadows", false, true), 
    IlIllllIIlIIlIlIlIll("enumFloat", 44, "options.realmsNotifications", false, true), 
    IllIllIlllIllllIIllI("FOG_FANCY", 45, "of.options.FOG_FANCY", false, false), 
    llIlIIIIIlIIlIlIIlll("FOG_START", 46, "of.options.FOG_START", false, false), 
    IlIIlIlIIIlIIlIlIlII("MIPMAP_TYPE", 47, "of.options.MIPMAP_TYPE", true, false, 0.0f, 3.0f, 1.0f), 
    IllIlIIllIllIIlIllII("SMOOTH_FPS", 48, "of.options.SMOOTH_FPS", false, false), 
    lIIlIIIlIllIlIllIIIl("CLOUDS", 49, "of.options.CLOUDS", false, false), 
    IIlIIIlllIllIllIlIII("CLOUD_HEIGHT", 50, "of.options.CLOUD_HEIGHT", true, false), 
    lIlIlIlllIIlIlIlllIl("TREES", 51, "of.options.TREES", false, false), 
    llIIIIIIlIllIIlIIIll("RAIN", 52, "of.options.RAIN", false, false), 
    lIIIIlIlIllllIIlIllI("ANIMATED_WATER", 53, "of.options.ANIMATED_WATER", false, false), 
    llIIIlIlllIllIIlIllI("ANIMATED_LAVA", 54, "of.options.ANIMATED_LAVA", false, false), 
    IlIIllIIllIIllIIlIIl("ANIMATED_FIRE", 55, "of.options.ANIMATED_FIRE", false, false), 
    lllllIIIIIlIlIIIIIIl("ANIMATED_PORTAL", 56, "of.options.ANIMATED_PORTAL", false, false), 
    IllIIlllllIIllIIllIl("AO_LEVEL", 57, "of.options.AO_LEVEL", true, false), 
    lIllIIIIIlllIIlIIllI("LAGOMETER", 58, "of.options.LAGOMETER", false, false), 
    lIlIIlllIIlIIlIlllIl("SHOW_FPS", 59, "of.options.SHOW_FPS", false, false), 
    llIIIllIlIllIllIIIIl("AUTOSAVE_TICKS", 60, "of.options.AUTOSAVE_TICKS", false, false), 
    IIIllIIIlIlIIllIIIlI("BETTER_GRASS", 61, "of.options.BETTER_GRASS", false, false), 
    IIlllIIlllIIIlIlllII("ANIMATED_REDSTONE", 62, "of.options.ANIMATED_REDSTONE", false, false), 
    IlIIlllllIIllIIlllll("ANIMATED_EXPLOSION", 63, "of.options.ANIMATED_EXPLOSION", false, false), 
    lllllIIlIlIIIlIlIIIl("ANIMATED_FLAME", 64, "of.options.ANIMATED_FLAME", false, false), 
    IIlllllIllIllIlIlIII("ANIMATED_SMOKE", 65, "of.options.ANIMATED_SMOKE", false, false), 
    llllIllllIllllIlIlII("WEATHER", 66, "of.options.WEATHER", false, false), 
    IIlIlIllllIlllIIIIll("SKY", 67, "of.options.SKY", false, false), 
    lIIllIIIllllIlllIllI("STARS", 68, "of.options.STARS", false, false), 
    IllIlIllIllIlllIIlll("SUN_MOON", 69, "of.options.SUN_MOON", false, false), 
    IIllIIIlIIlIlIlIIIII("VIGNETTE", 70, "of.options.VIGNETTE", false, false), 
    llIllIIlllllllllllll("CHUNK_UPDATES", 71, "of.options.CHUNK_UPDATES", false, false), 
    lllllIIllIlIllIllllI("CHUNK_UPDATES_DYNAMIC", 72, "of.options.CHUNK_UPDATES_DYNAMIC", false, false), 
    IlIIIIIlIIllIIlIlIll("TIME", 73, "of.options.TIME", false, false), 
    IllllIIlIlIllIIIllII("CLEAR_WATER", 74, "of.options.CLEAR_WATER", false, false), 
    lllllIIIIIlIIlllIlIl("SMOOTH_WORLD", 75, "of.options.SMOOTH_WORLD", false, false), 
    IlIllllIIIlIllIlIIll("VOID_PARTICLES", 76, "of.options.VOID_PARTICLES", false, false), 
    lIIIIIlIlIIIlIIIIlIl("WATER_PARTICLES", 77, "of.options.WATER_PARTICLES", false, false), 
    IIllIIIlIIIIlIIlIIII("RAIN_SPLASH", 78, "of.options.RAIN_SPLASH", false, false), 
    IIIllIIllIIIIIIlIIlI("PORTAL_PARTICLES", 79, "of.options.PORTAL_PARTICLES", false, false), 
    IIIIIIIllllIlIIIIIII("POTION_PARTICLES", 80, "of.options.POTION_PARTICLES", false, false), 
    IIlllIIIllIllIIlIlIl("FIREWORK_PARTICLES", 81, "of.options.FIREWORK_PARTICLES", false, false), 
    llIlllIlllllIIllIIII("PROFILER", 82, "of.options.PROFILER", false, false), 
    lllllIlIlIlllIlllIlI("DRIPPING_WATER_LAVA", 83, "of.options.DRIPPING_WATER_LAVA", false, false), 
    IlIllllIIlIllIlIlIll("BETTER_SNOW", 84, "of.options.BETTER_SNOW", false, false), 
    lllIlIIIIIlIlllllIlI("FULLSCREEN_MODE", 85, "of.options.FULLSCREEN_MODE", true, false, 0.0f, (float)net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI().length, 1.0f), 
    llIlIIIIllIlIIlIlIII("ANIMATED_TERRAIN", 86, "of.options.ANIMATED_TERRAIN", false, false), 
    IIIIIlllIlIIIIIIIllI("SWAMP_COLORS", 87, "of.options.SWAMP_COLORS", false, false), 
    llllllIIIIIIIlllIIll("RANDOM_ENTITIES", 88, "of.options.RANDOM_ENTITIES", false, false), 
    IIlIlllIlIlllIlIllll("SMOOTH_BIOMES", 89, "of.options.SMOOTH_BIOMES", false, false), 
    lIllllIllIllIIllllll("CUSTOM_FONTS", 90, "of.options.CUSTOM_FONTS", false, false), 
    lllIIIIlIlIllIIlIIIl("CUSTOM_COLORS", 91, "of.options.CUSTOM_COLORS", false, false), 
    IllIlllIllIIIIllllII("SHOW_CAPES", 92, "of.options.SHOW_CAPES", false, false), 
    lIllIlIIIllllllIIlII("CONNECTED_TEXTURES", 93, "of.options.CONNECTED_TEXTURES", false, false), 
    IlIllIIllIIlIIIIlIIl("CUSTOM_ITEMS", 94, "of.options.CUSTOM_ITEMS", false, false), 
    lIIlllIlllllIIlllIll("AA_LEVEL", 95, "of.options.AA_LEVEL", true, false, 0.0f, 16.0f, 1.0f), 
    lIllIIlIlIlllllIIIII("AF_LEVEL", 96, "of.options.AF_LEVEL", true, false, 1.0f, 16.0f, 1.0f), 
    lIIlIIIIIIIlIIlIlIIl("ANIMATED_TEXTURES", 97, "of.options.ANIMATED_TEXTURES", false, false), 
    IlIIlllIIlIlllllIIlI("NATURAL_TEXTURES", 98, "of.options.NATURAL_TEXTURES", false, false), 
    llllIlIllllIIlIIlIlI("EMISSIVE_TEXTURES", 99, "of.options.EMISSIVE_TEXTURES", false, false), 
    a("HELD_ITEM_TOOLTIPS", 100, "of.options.HELD_ITEM_TOOLTIPS", false, false), 
    b("DROPPED_ITEMS", 101, "of.options.DROPPED_ITEMS", false, false), 
    c("LAZY_CHUNK_LOADING", 102, "of.options.LAZY_CHUNK_LOADING", false, false), 
    d("CUSTOM_SKY", 103, "of.options.CUSTOM_SKY", false, false), 
    e("FAST_MATH", 104, "of.options.FAST_MATH", false, false), 
    f("FAST_RENDER", 105, "of.options.FAST_RENDER", false, false), 
    g("TRANSLUCENT_BLOCKS", 106, "of.options.TRANSLUCENT_BLOCKS", false, false), 
    h("DYNAMIC_FOV", 107, "of.options.DYNAMIC_FOV", false, false), 
    i("DYNAMIC_LIGHTS", 108, "of.options.DYNAMIC_LIGHTS", false, false), 
    j("ALTERNATE_BLOCKS", 109, "of.options.ALTERNATE_BLOCKS", false, false), 
    k("CUSTOM_ENTITY_MODELS", 110, "of.options.CUSTOM_ENTITY_MODELS", false, false), 
    l("ADVANCED_TOOLTIPS", 111, "of.options.ADVANCED_TOOLTIPS", false, false), 
    m("SCREENSHOT_SIZE", 112, "of.options.SCREENSHOT_SIZE", false, false), 
    n("CUSTOM_GUIS", 113, "of.options.CUSTOM_GUIS", false, false), 
    o("RENDER_REGIONS", 114, "of.options.RENDER_REGIONS", false, false), 
    p("SHOW_GL_ERRORS", 115, "of.options.SHOW_GL_ERRORS", false, false), 
    q("SMART_ANIMATIONS", 116, "of.options.SMART_ANIMATIONS", false, false);
    
    private final boolean r;
    private final boolean s;
    private final String t;
    private final float u;
    private float v;
    private float w;
    
    static {
        x = new llIllIIIIIllIlIIIIlI[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl, llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII, llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI, llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll, llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl, llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI, llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl, llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII, llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII, llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII, llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI, llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI, llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl, llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI, llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl, llIllIIIIIllIlIIIIlI.IIIIIIIIIlllIllIlIlI, llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl, llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl, llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll, llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII, llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl, llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII, llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll, llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI, llIllIIIIIllIlIIIIlI.llIlIIIIIlIIlIlIIlll, llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII, llIllIIIIIllIlIIIIlI.IllIlIIllIllIIlIllII, llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl, llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII, llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl, llIllIIIIIllIlIIIIlI.llIIIIIIlIllIIlIIIll, llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI, llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI, llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl, llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl, llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl, llIllIIIIIllIlIIIIlI.lIllIIIIIlllIIlIIllI, llIllIIIIIllIlIIIIlI.lIlIIlllIIlIIlIlllIl, llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl, llIllIIIIIllIlIIIIlI.IIIllIIIlIlIIllIIIlI, llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII, llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll, llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl, llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII, llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII, llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll, llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI.IllIlIllIllIlllIIlll, llIllIIIIIllIlIIIIlI.IIllIIIlIIlIlIlIIIII, llIllIIIIIllIlIIIIlI.llIllIIlllllllllllll, llIllIIIIIllIlIIIIlI.lllllIIllIlIllIllllI, llIllIIIIIllIlIIIIlI.IlIIIIIlIIllIIlIlIll, llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII, llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl, llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll, llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl, llIllIIIIIllIlIIIIlI.IIllIIIlIIIIlIIlIIII, llIllIIIIIllIlIIIIlI.IIIllIIllIIIIIIlIIlI, llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII, llIllIIIIIllIlIIIIlI.IIlllIIIllIllIIlIlIl, llIllIIIIIllIlIIIIlI.llIlllIlllllIIllIIII, llIllIIIIIllIlIIIIlI.lllllIlIlIlllIlllIlI, llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll, llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI, llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII, llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI, llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll, llIllIIIIIllIlIIIIlI.IIlIlllIlIlllIlIllll, llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll, llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl, llIllIIIIIllIlIIIIlI.IllIlllIllIIIIllllII, llIllIIIIIllIlIIIIlI.lIllIlIIIllllllIIlII, llIllIIIIIllIlIIIIlI.IlIllIIllIIlIIIIlIIl, llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll, llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII, llIllIIIIIllIlIIIIlI.lIIlIIIIIIIlIIlIlIIl, llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI, llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI, llIllIIIIIllIlIIIIlI.a, llIllIIIIIllIlIIIIlI.b, llIllIIIIIllIlIIIIlI.c, llIllIIIIIllIlIIIIlI.d, llIllIIIIIllIlIIIIlI.e, llIllIIIIIllIlIIIIlI.f, llIllIIIIIllIlIIIIlI.g, llIllIIIIIllIlIIIIlI.h, llIllIIIIIllIlIIIIlI.i, llIllIIIIIllIlIIIIlI.j, llIllIIIIIllIlIIIIlI.k, llIllIIIIIllIlIIIIlI.l, llIllIIIIIllIlIIIIlI.m, llIllIIIIIllIlIIIIlI.n, llIllIIIIIllIlIIIIlI.o, llIllIIIIIllIlIIIIlI.p, llIllIIIIIllIlIIIIlI.q };
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final int n) {
        llIllIIIIIllIlIIIIlI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = values[i];
            if (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI() == n) {
                return llIllIIIIIllIlIIIIlI;
            }
        }
        return null;
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final String s2, final boolean b, final boolean b2) {
        this(s, n, s2, b, b2, 0.0f, 1.0f, 0.0f);
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final String t, final boolean r, final boolean s2, final float v, final float w, final float u) {
        this.t = t;
        this.r = r;
        this.s = s2;
        this.v = v;
        this.w = w;
        this.u = u;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.r;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.s;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.ordinal();
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.t;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.w;
    }
    
    public void llllIIIIlIIIlIlllIll(final float w) {
        this.w = w;
    }
    
    public float IlIlIlIlIlllllllllIl(final float n) {
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IlIIIlIlIIIllIlIlIIl(n) - this.v) / (this.w - this.v), 0.0f, 1.0f);
    }
    
    public float llIllIIIIIllIlIIIIlI(final float n) {
        return this.IlIIIlIlIIIllIlIlIIl(this.v + (this.w - this.v) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0.0f, 1.0f));
    }
    
    public float IlIIIlIlIIIllIlIlIIl(float ilIlIIIllIllIIIIIllI) {
        ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI);
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, this.v, this.w);
    }
    
    protected float IlIlIIIllIllIIIIIllI(float n) {
        if (this.u > 0.0f) {
            n = this.u * Math.round(n / this.u);
        }
        return n;
    }
}
