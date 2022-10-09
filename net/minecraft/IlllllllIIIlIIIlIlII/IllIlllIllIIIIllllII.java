package net.minecraft.IlllllllIIIlIIIlIlII;

import java.nio.*;
import org.apache.logging.log4j.*;
import java.text.*;
import java.io.*;
import net.minecraft.client.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import javax.imageio.*;
import java.awt.image.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import java.util.*;

public class IllIlllIllIIIIllllII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final DateFormat IlIlIlIlIlllllllllIl;
    private static IntBuffer llIllIIIIIllIlIIIIlI;
    private static int[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final File file, final int n, final int n2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll(file, null, n, n2, llllIIIIlIIIlIlllIll);
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final File file, final String s, int llllIIIIlIIIlIlllIll, int ilIlIlIlIlllllllllIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        try {
            final File file2 = new File(file, "screenshots");
            file2.mkdir();
            final Minecraft minecraft = Minecraft.getMinecraft();
            final int iIlIlllIlIlllIlIllll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().IIlIlllIlIlllIlIllll;
            final int ilIlIIIllIllIIIIIllI = new g(minecraft).IlIlIIIllIllIIIIIllI();
            final int c = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.C();
            final boolean b = lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII() && c > 1;
            if (b) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().IIlIlllIlIlllIlIllll = ilIlIIIllIllIIIIIllI * c;
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll * c, ilIlIlIlIlllllllllIl * c);
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(16640);
                minecraft.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(true);
                minecraft.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, System.nanoTime());
            }
            if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll;
                ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl;
            }
            final int n = llllIIIIlIIIlIlllIll * ilIlIlIlIlllllllllIl;
            if (IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI == null || IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI.capacity() < n) {
                IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI = BufferUtils.createIntBuffer(n);
                IllIlllIllIIIIllllII.IlIIIlIlIIIllIlIlIIl = new int[n];
            }
            GL11.glPixelStorei(3333, 1);
            GL11.glPixelStorei(3317, 1);
            IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI.clear();
            if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl);
                GL11.glGetTexImage(3553, 0, 32993, 33639, IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI);
            }
            else {
                GL11.glReadPixels(0, 0, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, 32993, 33639, IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI);
            }
            IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI.get(IllIlllIllIIIIllllII.IlIIIlIlIIIllIlIlIIl);
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IllIlllIllIIIIllllII.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            BufferedImage bufferedImage;
            if (lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                bufferedImage = new BufferedImage(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl, 1);
                int i;
                for (int n2 = i = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl - llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl; i < llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl; ++i) {
                    for (int j = 0; j < llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI; ++j) {
                        bufferedImage.setRGB(j, i - n2, IllIlllIllIIIIllllII.IlIIIlIlIIIllIlIlIIl[i * llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll + j]);
                    }
                }
            }
            else {
                bufferedImage = new BufferedImage(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, 1);
                bufferedImage.setRGB(0, 0, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, IllIlllIllIIIIllllII.IlIIIlIlIIIllIlIlIIl, 0, llllIIIIlIIIlIlllIll);
            }
            if (b) {
                minecraft.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().IIlIlllIlIlllIlIllll = iIlIlllIlIlllIlIllll;
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            }
            File llllIIIIlIIIlIlllIll3;
            if (s == null) {
                llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(file2);
            }
            else {
                llllIIIIlIIIlIlllIll3 = new File(file2, s);
            }
            final File canonicalFile = llllIIIIlIIIlIlllIll3.getCanonicalFile();
            ImageIO.write(bufferedImage, "png", canonicalFile);
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(canonicalFile.getName());
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, canonicalFile.getAbsolutePath()));
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().IlIIIlIlIIIllIlIlIIl(true);
            return new IIllIIllIIIlIlIIIIlI("screenshot.success", new Object[] { ilIlIIIIIIlllIlIllIl });
        }
        catch (Exception ex) {
            IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll.warn("Couldn't save screenshot", (Throwable)ex);
            return new IIllIIllIIIlIlIIIIlI("screenshot.failure", new Object[] { ex.getMessage() });
        }
    }
    
    private static File llllIIIIlIIIlIlllIll(final File file) {
        final String string = IllIlllIllIIIIllllII.IlIlIlIlIlllllllllIl.format(new Date()).toString();
        int n = 1;
        File file2;
        while (true) {
            file2 = new File(file, String.valueOf(string) + ((n == 1) ? "" : ("_" + n)) + ".png");
            if (!file2.exists()) {
                break;
            }
            ++n;
        }
        return file2;
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.IlIIIlIlIIIllIlIlIIl = Math.max(1, n);
        minecraft.IlIlIIIllIllIIIIIllI = Math.max(1, n2);
        if (minecraft.IIIIlllIIIIIIlIIIlll != null) {
            final g g = new g(minecraft);
            minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(minecraft, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
        }
        llllIIIIlIIIlIlllIll();
    }
    
    private static void llllIIIIlIIIlIlllIll() {
        final Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(minecraft.IlIIIlIlIIIllIlIlIIl, minecraft.IlIlIIIllIllIIIIIllI);
        if (minecraft.IlIllIlIlIIIlIlIlIII != null) {
            minecraft.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(minecraft.IlIIIlIlIIIllIlIlIIl, minecraft.IlIlIIIllIllIIIIIllI);
        }
    }
}
