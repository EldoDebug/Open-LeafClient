package net.optifine.llllIIIlIlllIlIIIIIl;

import java.util.regex.*;
import leaf.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import org.apache.commons.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import java.io.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.awt.image.*;
import java.awt.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class IlIlIlIlIlllllllllIl
{
    private static final Pattern llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("[a-zA-Z0-9_]+");
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final String llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null && !llllIIllllIlIlIIIIll.isEmpty() && !llllIIllllIlIlIIIIll.contains("\u0000") && IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.matcher(llllIIllllIlIlIIIIll).matches()) {
            String s = "http://s.optifine.net/capes/" + llllIIllllIlIlIIIIll + ".png";
            if (!Leaf.instance.modManager.hideCape) {
                if (llllIIIIlIIIlIlllIll instanceof llIllIIIIIllIlIIIIlI) {
                    if (!Leaf.instance.modManager.capeSetting.equals("None")) {
                        s = "https://www.dropbox.com/s/" + Leaf.instance.modManager.capeSetting + "?raw=1";
                    }
                }
                else if (Leaf.instance.downloadPlayerData.capeData.containsKey(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString())) {
                    s = "https://www.dropbox.com/s/" + Leaf.instance.downloadPlayerData.capeData.get(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString()) + "?raw=1";
                }
            }
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("capeof/" + FilenameUtils.getBaseName(s));
            if (!Leaf.instance.modManager.hideWing && llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() == null) {
                if (llllIIIIlIIIlIlllIll instanceof llIllIIIIIllIlIIIIlI) {
                    if (!Leaf.instance.modManager.wingSetting.equals("None")) {
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(Leaf.instance.downloadPlayerData.data.get(Leaf.instance.modManager.wingSetting));
                    }
                }
                else if (Leaf.instance.downloadPlayerData.wingData.containsKey(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString())) {
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(Leaf.instance.downloadPlayerData.data.get(Leaf.instance.downloadPlayerData.wingData.get(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString())));
                }
            }
            if (!Leaf.instance.modManager.IlIlIIIlIIlIlIIlllIl && llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI() == null) {
                if (llllIIIIlIIIlIlllIll instanceof llIllIIIIIllIlIIIIlI) {
                    if (!Leaf.instance.modManager.hatSetting.equals("None")) {
                        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(Leaf.instance.downloadPlayerData.data.get(Leaf.instance.modManager.hatSetting));
                    }
                }
                else if (Leaf.instance.downloadPlayerData.hatData.containsKey(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString())) {
                    llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(Leaf.instance.downloadPlayerData.data.get(Leaf.instance.downloadPlayerData.hatData.get(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString())));
                }
            }
            final IIlllIIlIllIllIlIIll lllIllIIIllllllIllll = Minecraft.getMinecraft().lllIllIIIllllllIllll();
            final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
            if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl instanceof IlIIlllllIIllIIlllll) {
                final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll = (IlIIlllllIIllIIlllll)ilIlIlIlIlllllllllIl;
                if (ilIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll != null) {
                    if (ilIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll) {
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                        if (ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI() instanceof net.optifine.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(((net.optifine.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)ilIIlllllIIllIIlllll.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI());
                        }
                    }
                    return;
                }
            }
            final IlIIlllllIIllIIlllll ilIIlllllIIllIIlllll2 = new IlIIlllllIIllIIlllll(null, s, null, new net.optifine.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIllllIllIllIIllllll));
            ilIIlllllIIllIIlllll2.IlIlIlIlIlllllllllIl = true;
            lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIIlllllIIllIIlllll2);
        }
    }
    
    public static BufferedImage llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage) {
        int n = 64;
        int n2 = 32;
        for (int width = bufferedImage.getWidth(), height = bufferedImage.getHeight(); n < width || n2 < height; n *= 2, n2 *= 2) {}
        final BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        final Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final BufferedImage bufferedImage, final BufferedImage bufferedImage2) {
        return bufferedImage.getWidth() > bufferedImage2.getHeight();
    }
    
    public static void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("capeof/" + llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll());
        final IIlllIIlIllIllIlIIll llIIIlIlllIllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI();
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        if (ilIlIlIlIlllllllllIl instanceof lIIIlllIIIllIIIllIII) {
            ((lIIIlllIIIllIIIllIII)ilIlIlIlIlllllllllIl).IllIIlllIIIIlllIIlIl();
            llIIIlIlllIllIIlIllI.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll);
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((lIllllIllIllIIllllll)null);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
}
