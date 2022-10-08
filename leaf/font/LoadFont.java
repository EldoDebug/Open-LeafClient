package leaf.font;

import java.awt.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class LoadFont
{
    static volatile int llllIIIIlIIIlIlllIll;
    public static MinecraftFontRenderer minecraftFontRenderer;
    private static Font font;
    
    static Font getFont(final Map map, final String s, final int n) {
        Font font;
        try {
            if (map.containsKey(s)) {
                font = map.get(s).deriveFont(0, (float)n);
            }
            else {
                final Font font2 = Font.createFont(0, Minecraft.getMinecraft().llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/font/" + s)).IlIlIlIlIlllllllllIl());
                map.put(s, font2);
                font = font2.deriveFont(0, (float)n);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, 10);
        }
        return font;
    }
    
    static boolean llllIIIIlIIIlIlllIll() {
        return LoadFont.llllIIIIlIIIlIlllIll >= 3;
    }
    
    public static void loadFont() {
        new Thread(() -> {
            LoadFont.font = getFont(new HashMap(), "arial.ttf", 19);
            ++LoadFont.llllIIIIlIIIlIlllIll;
            return;
        }).start();
        final HashMap hashMap;
        new Thread(() -> {
            hashMap = new HashMap();
            ++LoadFont.llllIIIIlIIIlIlllIll;
            return;
        }).start();
        final HashMap hashMap2;
        new Thread(() -> {
            hashMap2 = new HashMap();
            ++LoadFont.llllIIIIlIIIlIlllIll;
            return;
        }).start();
        while (!llllIIIIlIIIlIlllIll()) {
            try {
                Thread.sleep(5L);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        LoadFont.minecraftFontRenderer = new MinecraftFontRenderer(LoadFont.font, true, true);
    }
}
