package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import com.google.gson.*;

public class lIIIlllIIIllIIIllIII implements JsonDeserializer, JsonSerializer
{
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII();
        try {
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "coordinateScale", liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl);
            liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "heightScale", liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
            liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lowerLimitScale", liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI);
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "upperLimitScale", liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl);
            liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "depthNoiseScaleX", liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl);
            liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "depthNoiseScaleZ", liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl);
            liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "depthNoiseScaleExponent", liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII);
            liiiIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "mainNoiseScaleX", liiiIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII);
            liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "mainNoiseScaleY", liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl);
            liiiIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "mainNoiseScaleZ", liiiIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI);
            liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "baseSize", liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI);
            liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "stretchY", liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI);
            liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "biomeDepthWeight", liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll);
            liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "biomeDepthOffset", liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll);
            liiiIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "biomeScaleWeight", liiiIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII);
            liiiIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "biomeScaleOffset", liiiIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll);
            liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "seaLevel", liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl);
            liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useCaves", liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl);
            liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useDungeons", liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI);
            liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dungeonChance", liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll);
            liiiIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useStrongholds", liiiIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl);
            liiiIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useVillages", liiiIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII);
            liiiIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useMineShafts", liiiIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII);
            liiiIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useTemples", liiiIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII);
            liiiIlIIIIIlllIllIII.IlIlIllllllllIIIIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useMonuments", liiiIlIIIIIlllIllIII.IlIlIllllllllIIIIlII);
            liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useRavines", liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl);
            liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useWaterLakes", liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII);
            liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "waterLakeChance", liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII);
            liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useLavaLakes", liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII);
            liiiIlIIIIIlllIllIII.llIIlllIIlllIIllIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lavaLakeChance", liiiIlIIIIIlllIllIII.llIIlllIIlllIIllIllI);
            liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "useLavaOceans", liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII);
            liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "fixedBiome", liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll);
            if (liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll < 38 && liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll >= -1) {
                if (liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll >= llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII.lIIIIIlIlIIIlIIIIlIl) {
                    final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2 = liiiIlIIIIIlllIllIII;
                    liiiIlIIIIIlllIllIII2.IIlIIIIIllIlIIIlIIll += 2;
                }
            }
            else {
                liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll = -1;
            }
            liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "biomeSize", liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI);
            liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "riverSize", liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl);
            liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dirtSize", liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI);
            liiiIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dirtCount", liiiIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl);
            liiiIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dirtMinHeight", liiiIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI);
            liiiIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dirtMaxHeight", liiiIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl);
            liiiIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "gravelSize", liiiIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl);
            liiiIlIIIIIlllIllIII.lllIllIIIllllllIllll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "gravelCount", liiiIlIIIIIlllIllIII.lllIllIIIllllllIllll);
            liiiIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "gravelMinHeight", liiiIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII);
            liiiIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "gravelMaxHeight", liiiIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl);
            liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "graniteSize", liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII);
            liiiIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "graniteCount", liiiIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll);
            liiiIlIIIIIlllIllIII.IllIllIlllIllllIIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "graniteMinHeight", liiiIlIIIIIlllIllIII.IllIllIlllIllllIIllI);
            liiiIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "graniteMaxHeight", liiiIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll);
            liiiIlIIIIIlllIllIII.IlIIlIlIIIlIIlIlIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dioriteSize", liiiIlIIIIIlllIllIII.IlIIlIlIIIlIIlIlIlII);
            liiiIlIIIIIlllIllIII.IllIlIIllIllIIlIllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dioriteCount", liiiIlIIIIIlllIllIII.IllIlIIllIllIIlIllII);
            liiiIlIIIIIlllIllIII.lIIlIIIlIllIlIllIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dioriteMinHeight", liiiIlIIIIIlllIllIII.lIIlIIIlIllIlIllIIIl);
            liiiIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "dioriteMaxHeight", liiiIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII);
            liiiIlIIIIIlllIllIII.lIlIlIlllIIlIlIlllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "andesiteSize", liiiIlIIIIIlllIllIII.lIlIlIlllIIlIlIlllIl);
            liiiIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "andesiteCount", liiiIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll);
            liiiIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "andesiteMinHeight", liiiIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI);
            liiiIlIIIIIlllIllIII.llIIIlIlllIllIIlIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "andesiteMaxHeight", liiiIlIIIIIlllIllIII.llIIIlIlllIllIIlIllI);
            liiiIlIIIIIlllIllIII.IlIIllIIllIIllIIlIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "coalSize", liiiIlIIIIIlllIllIII.IlIIllIIllIIllIIlIIl);
            liiiIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "coalCount", liiiIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl);
            liiiIlIIIIIlllIllIII.IllIIlllllIIllIIllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "coalMinHeight", liiiIlIIIIIlllIllIII.IllIIlllllIIllIIllIl);
            liiiIlIIIIIlllIllIII.lIllIIIIIlllIIlIIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "coalMaxHeight", liiiIlIIIIIlllIllIII.lIllIIIIIlllIIlIIllI);
            liiiIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "ironSize", liiiIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl);
            liiiIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "ironCount", liiiIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl);
            liiiIlIIIIIlllIllIII.IIIllIIIlIlIIllIIIlI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "ironMinHeight", liiiIlIIIIIlllIllIII.IIIllIIIlIlIIllIIIlI);
            liiiIlIIIIIlllIllIII.IIlllIIlllIIIlIlllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "ironMaxHeight", liiiIlIIIIIlllIllIII.IIlllIIlllIIIlIlllII);
            liiiIlIIIIIlllIllIII.IlIIlllllIIllIIlllll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "goldSize", liiiIlIIIIIlllIllIII.IlIIlllllIIllIIlllll);
            liiiIlIIIIIlllIllIII.lllllIIlIlIIIlIlIIIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "goldCount", liiiIlIIIIIlllIllIII.lllllIIlIlIIIlIlIIIl);
            liiiIlIIIIIlllIllIII.IIlllllIllIllIlIlIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "goldMinHeight", liiiIlIIIIIlllIllIII.IIlllllIllIllIlIlIII);
            liiiIlIIIIIlllIllIII.llllIllllIllllIlIlII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "goldMaxHeight", liiiIlIIIIIlllIllIII.llllIllllIllllIlIlII);
            liiiIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "redstoneSize", liiiIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll);
            liiiIlIIIIIlllIllIII.lIIllIIIllllIlllIllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "redstoneCount", liiiIlIIIIIlllIllIII.lIIllIIIllllIlllIllI);
            liiiIlIIIIIlllIllIII.IllIlIllIllIlllIIlll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "redstoneMinHeight", liiiIlIIIIIlllIllIII.IllIlIllIllIlllIIlll);
            liiiIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "redstoneMaxHeight", liiiIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII);
            liiiIlIIIIIlllIllIII.llIllIIlllllllllllll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "diamondSize", liiiIlIIIIIlllIllIII.llIllIIlllllllllllll);
            liiiIlIIIIIlllIllIII.lllllIIllIlIllIllllI = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "diamondCount", liiiIlIIIIIlllIllIII.lllllIIllIlIllIllllI);
            liiiIlIIIIIlllIllIII.IlIIIIIlIIllIIlIlIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "diamondMinHeight", liiiIlIIIIIlllIllIII.IlIIIIIlIIllIIlIlIll);
            liiiIlIIIIIlllIllIII.IllllIIlIlIllIIIllII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "diamondMaxHeight", liiiIlIIIIIlllIllIII.IllllIIlIlIllIIIllII);
            liiiIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lapisSize", liiiIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl);
            liiiIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lapisCount", liiiIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll);
            liiiIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lapisCenterHeight", liiiIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl);
            liiiIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "lapisSpread", liiiIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII);
        }
        catch (Exception ex) {}
        return liiiIlIIIIIlllIllIII;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("coordinateScale", (Number)liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl);
        jsonObject.addProperty("heightScale", (Number)liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
        jsonObject.addProperty("lowerLimitScale", (Number)liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI);
        jsonObject.addProperty("upperLimitScale", (Number)liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl);
        jsonObject.addProperty("depthNoiseScaleX", (Number)liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl);
        jsonObject.addProperty("depthNoiseScaleZ", (Number)liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl);
        jsonObject.addProperty("depthNoiseScaleExponent", (Number)liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII);
        jsonObject.addProperty("mainNoiseScaleX", (Number)liiiIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII);
        jsonObject.addProperty("mainNoiseScaleY", (Number)liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl);
        jsonObject.addProperty("mainNoiseScaleZ", (Number)liiiIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI);
        jsonObject.addProperty("baseSize", (Number)liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI);
        jsonObject.addProperty("stretchY", (Number)liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI);
        jsonObject.addProperty("biomeDepthWeight", (Number)liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll);
        jsonObject.addProperty("biomeDepthOffset", (Number)liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll);
        jsonObject.addProperty("biomeScaleWeight", (Number)liiiIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII);
        jsonObject.addProperty("biomeScaleOffset", (Number)liiiIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll);
        jsonObject.addProperty("seaLevel", (Number)liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl);
        jsonObject.addProperty("useCaves", Boolean.valueOf(liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl));
        jsonObject.addProperty("useDungeons", Boolean.valueOf(liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI));
        jsonObject.addProperty("dungeonChance", (Number)liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll);
        jsonObject.addProperty("useStrongholds", Boolean.valueOf(liiiIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl));
        jsonObject.addProperty("useVillages", Boolean.valueOf(liiiIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII));
        jsonObject.addProperty("useMineShafts", Boolean.valueOf(liiiIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII));
        jsonObject.addProperty("useTemples", Boolean.valueOf(liiiIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII));
        jsonObject.addProperty("useMonuments", Boolean.valueOf(liiiIlIIIIIlllIllIII.IlIlIllllllllIIIIlII));
        jsonObject.addProperty("useRavines", Boolean.valueOf(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl));
        jsonObject.addProperty("useWaterLakes", Boolean.valueOf(liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII));
        jsonObject.addProperty("waterLakeChance", (Number)liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII);
        jsonObject.addProperty("useLavaLakes", Boolean.valueOf(liiiIlIIIIIlllIllIII.lIllllllIIllIlIlIlII));
        jsonObject.addProperty("lavaLakeChance", (Number)liiiIlIIIIIlllIllIII.llIIlllIIlllIIllIllI);
        jsonObject.addProperty("useLavaOceans", Boolean.valueOf(liiiIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII));
        jsonObject.addProperty("fixedBiome", (Number)liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll);
        jsonObject.addProperty("biomeSize", (Number)liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI);
        jsonObject.addProperty("riverSize", (Number)liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl);
        jsonObject.addProperty("dirtSize", (Number)liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI);
        jsonObject.addProperty("dirtCount", (Number)liiiIlIIIIIlllIllIII.IIIIIllIIIIlIIIIllIl);
        jsonObject.addProperty("dirtMinHeight", (Number)liiiIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI);
        jsonObject.addProperty("dirtMaxHeight", (Number)liiiIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl);
        jsonObject.addProperty("gravelSize", (Number)liiiIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl);
        jsonObject.addProperty("gravelCount", (Number)liiiIlIIIIIlllIllIII.lllIllIIIllllllIllll);
        jsonObject.addProperty("gravelMinHeight", (Number)liiiIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII);
        jsonObject.addProperty("gravelMaxHeight", (Number)liiiIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl);
        jsonObject.addProperty("graniteSize", (Number)liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII);
        jsonObject.addProperty("graniteCount", (Number)liiiIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll);
        jsonObject.addProperty("graniteMinHeight", (Number)liiiIlIIIIIlllIllIII.IllIllIlllIllllIIllI);
        jsonObject.addProperty("graniteMaxHeight", (Number)liiiIlIIIIIlllIllIII.llIlIIIIIlIIlIlIIlll);
        jsonObject.addProperty("dioriteSize", (Number)liiiIlIIIIIlllIllIII.IlIIlIlIIIlIIlIlIlII);
        jsonObject.addProperty("dioriteCount", (Number)liiiIlIIIIIlllIllIII.IllIlIIllIllIIlIllII);
        jsonObject.addProperty("dioriteMinHeight", (Number)liiiIlIIIIIlllIllIII.lIIlIIIlIllIlIllIIIl);
        jsonObject.addProperty("dioriteMaxHeight", (Number)liiiIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII);
        jsonObject.addProperty("andesiteSize", (Number)liiiIlIIIIIlllIllIII.lIlIlIlllIIlIlIlllIl);
        jsonObject.addProperty("andesiteCount", (Number)liiiIlIIIIIlllIllIII.llIIIIIIlIllIIlIIIll);
        jsonObject.addProperty("andesiteMinHeight", (Number)liiiIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI);
        jsonObject.addProperty("andesiteMaxHeight", (Number)liiiIlIIIIIlllIllIII.llIIIlIlllIllIIlIllI);
        jsonObject.addProperty("coalSize", (Number)liiiIlIIIIIlllIllIII.IlIIllIIllIIllIIlIIl);
        jsonObject.addProperty("coalCount", (Number)liiiIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl);
        jsonObject.addProperty("coalMinHeight", (Number)liiiIlIIIIIlllIllIII.IllIIlllllIIllIIllIl);
        jsonObject.addProperty("coalMaxHeight", (Number)liiiIlIIIIIlllIllIII.lIllIIIIIlllIIlIIllI);
        jsonObject.addProperty("ironSize", (Number)liiiIlIIIIIlllIllIII.lIlIIlllIIlIIlIlllIl);
        jsonObject.addProperty("ironCount", (Number)liiiIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl);
        jsonObject.addProperty("ironMinHeight", (Number)liiiIlIIIIIlllIllIII.IIIllIIIlIlIIllIIIlI);
        jsonObject.addProperty("ironMaxHeight", (Number)liiiIlIIIIIlllIllIII.IIlllIIlllIIIlIlllII);
        jsonObject.addProperty("goldSize", (Number)liiiIlIIIIIlllIllIII.IlIIlllllIIllIIlllll);
        jsonObject.addProperty("goldCount", (Number)liiiIlIIIIIlllIllIII.lllllIIlIlIIIlIlIIIl);
        jsonObject.addProperty("goldMinHeight", (Number)liiiIlIIIIIlllIllIII.IIlllllIllIllIlIlIII);
        jsonObject.addProperty("goldMaxHeight", (Number)liiiIlIIIIIlllIllIII.llllIllllIllllIlIlII);
        jsonObject.addProperty("redstoneSize", (Number)liiiIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll);
        jsonObject.addProperty("redstoneCount", (Number)liiiIlIIIIIlllIllIII.lIIllIIIllllIlllIllI);
        jsonObject.addProperty("redstoneMinHeight", (Number)liiiIlIIIIIlllIllIII.IllIlIllIllIlllIIlll);
        jsonObject.addProperty("redstoneMaxHeight", (Number)liiiIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII);
        jsonObject.addProperty("diamondSize", (Number)liiiIlIIIIIlllIllIII.llIllIIlllllllllllll);
        jsonObject.addProperty("diamondCount", (Number)liiiIlIIIIIlllIllIII.lllllIIllIlIllIllllI);
        jsonObject.addProperty("diamondMinHeight", (Number)liiiIlIIIIIlllIllIII.IlIIIIIlIIllIIlIlIll);
        jsonObject.addProperty("diamondMaxHeight", (Number)liiiIlIIIIIlllIllIII.IllllIIlIlIllIIIllII);
        jsonObject.addProperty("lapisSize", (Number)liiiIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl);
        jsonObject.addProperty("lapisCount", (Number)liiiIlIIIIIlllIllIII.IlIllllIIIlIllIlIIll);
        jsonObject.addProperty("lapisCenterHeight", (Number)liiiIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl);
        jsonObject.addProperty("lapisSpread", (Number)liiiIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII);
        return (JsonElement)jsonObject;
    }
}
