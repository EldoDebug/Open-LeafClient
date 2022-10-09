package net.optifine.llllIIIlIlllIlIIIIIl;

import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.awt.image.*;
import net.optifine.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import javax.imageio.*;
import java.io.*;
import com.google.gson.*;

public class IlIlIIIllIllIIIIIllI
{
    private String IlIIIlIlIIIllIlIlIIl;
    public static final String llllIIIIlIIIlIlllIll = "items";
    public static final String IlIlIlIlIlllllllllIl = "type";
    public static final String llIllIIIIIllIlIIIIlI = "active";
    
    public IlIlIIIllIllIIIIIllI(final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement) {
        if (jsonElement == null) {
            throw new JsonParseException("JSON object is null, player: " + this.IlIIIlIlIIIllIlIlIIl);
        }
        final JsonObject jsonObject = (JsonObject)jsonElement;
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl();
        final JsonArray jsonArray = (JsonArray)jsonObject.get("items");
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); ++i) {
                final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                if (lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "active", true)) {
                    final String llllIIIIlIIIlIlllIll = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "type");
                    if (llllIIIIlIIIlIlllIll == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Item type is null, player: " + this.IlIIIlIlIIIllIlIlIIl);
                    }
                    else {
                        String s = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "model");
                        if (s == null) {
                            s = "items/" + llllIIIIlIIIlIlllIll + "/model.cfg";
                        }
                        final lIIIIlIIIIIlllIllIII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(s);
                        if (ilIlIlIlIlllllllllIl != null) {
                            if (!ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                                String s2 = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "texture");
                                if (s2 == null) {
                                    s2 = "items/" + llllIIIIlIIIlIlllIll + "/users/" + this.IlIIIlIlIIIllIlIlIIl + ".png";
                                }
                                final BufferedImage llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(s2);
                                if (llllIIIIlIIIlIlllIll2 == null) {
                                    continue;
                                }
                                ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                                ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("optifine.net", s2));
                            }
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                        }
                    }
                }
            }
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    private BufferedImage llllIIIIlIIIlIlllIll(final String s) {
        final String string = String.valueOf(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()) + "/" + s;
        try {
            return ImageIO.read(new ByteArrayInputStream(net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(string, Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl())));
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error loading item texture " + s + ": " + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl(final String s) {
        final String string = String.valueOf(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()) + "/" + s;
        try {
            return lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll((JsonObject)new JsonParser().parse(new String(net.optifine.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(string, Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl()), "ASCII")));
        }
        catch (Exception ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error loading item model " + s + ": " + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
}
