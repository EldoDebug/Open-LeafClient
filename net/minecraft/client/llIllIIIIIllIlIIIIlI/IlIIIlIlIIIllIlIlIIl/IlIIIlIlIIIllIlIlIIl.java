package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.net.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import tv.twitch.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIlIIIllIIllIlllllI.*;

public class IlIIIlIlIIIllIlIlIIl extends lIIllIIIllllIlllIllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private final llIIIIIIlIllIIlIIIll IllIIlllIIIIlllIIlIl;
    private final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl;
    private final IlIlIIIllIllIIIIIllI lIIIIlIIIIIlllIllIII;
    private final List lIIIlllIIIllIIIllIII;
    private final List llIIlIIIlIIIllIlIIIl;
    private static volatile /* synthetic */ int[] llIllIlIIIIllIlIIllI;
    private static volatile /* synthetic */ int[] lIlIlIIIllIIllIIIllI;
    private static volatile /* synthetic */ int[] IIIlIIIlIlIIlllIIlll;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this(liIllIIIllllIlllIllI, ilIlIIIllIllIIIIIllI, null);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl, final IlIlIIIllIllIIIIIllI liiiIlIIIIIlllIllIII, final List liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = new IIllIIllIIIlIlIIIIlI("stream.unavailable.title", new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    @Override
    public void n_() {
        if (this.llIIlIIIlIIIllIlIIIl.isEmpty()) {
            this.llIIlIIIlIIIllIlIIIl.addAll(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII(), (int)(this.llllIIllllIlIlIIIIll * 0.75f)));
            if (this.lIIIlllIIIllIIIllIII != null) {
                this.llIIlIIIlIIIllIlIIIl.add("");
                final Iterator<IIllIIllIIIlIlIIIIlI> iterator = this.lIIIlllIIIllIIIllIII.iterator();
                while (iterator.hasNext()) {
                    this.llIIlIIIlIIIllIlIIIl.add(iterator.next().llIllIIIIIllIlIIIIlI());
                }
            }
        }
        if (this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl() != null) {
            this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII - 50, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
            this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII - 50, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().lIIIlllIIIllIIIllIII(), new Object[0])));
        }
        else {
            this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 75, this.IlIllIlIlIIIlIlIlIII - 50, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.cancel", new Object[0])));
        }
    }
    
    @Override
    public void o_() {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        int max = Math.max((int)(this.IlIllIlIlIIIlIlIlIII * 0.85 / 2.0 - this.llIIlIIIlIIIllIlIIIl.size() * this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll / 2.0f), 50);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII(), this.llllIIllllIlIlIIIIll / 2, max - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 2, 16777215);
        final Iterator<String> iterator = this.llIIlIIIlIIIllIlIIIl.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, iterator.next(), this.llllIIllllIlIlIIIIll / 2, max, 10526880);
            max += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                switch (IlIlIIIllIllIIIIIllI()[this.lIIIIlIIIIIlllIllIII.ordinal()]) {
                    case 8:
                    case 9: {
                        this.llllIIIIlIIIlIlllIll("https://account.mojang.com/me/settings");
                        break;
                    }
                    case 7: {
                        this.llllIIIIlIIIlIlllIll("https://account.mojang.com/migrate");
                        break;
                    }
                    case 5: {
                        this.llllIIIIlIIIlIlllIll("http://www.apple.com/osx/");
                        break;
                    }
                    case 3:
                    case 11:
                    case 12: {
                        this.llllIIIIlIIIlIlllIll("http://bugs.mojang.com/browse/MC");
                        break;
                    }
                }
            }
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final String s) {
        try {
            final Class<?> forName = Class.forName("java.awt.Desktop");
            forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), new URI(s));
        }
        catch (Throwable t) {
            IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.error("Couldn't open link", t);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final Minecraft minecraft = Minecraft.getMinecraft();
        final IlIlIIIllIIllIlllllI liIlIIIlIllIlIllIIIl = minecraft.lIIlIIIlIllIlIllIIIl();
        if (!lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            final ArrayList arrayList = Lists.newArrayList();
            arrayList.add(new IIllIIllIIIlIlIIIIlI("stream.unavailable.no_fbo.version", new Object[] { GL11.glGetString(7938) }));
            arrayList.add(new IIllIIllIIIlIlIIIIlI("stream.unavailable.no_fbo.blend", new Object[] { GLContext.getCapabilities().GL_EXT_blend_func_separate }));
            arrayList.add(new IIllIIllIIIlIlIIIIlI("stream.unavailable.no_fbo.arb", new Object[] { GLContext.getCapabilities().GL_ARB_framebuffer_object }));
            arrayList.add(new IIllIIllIIIlIlIIIIlI("stream.unavailable.no_fbo.ext", new Object[] { GLContext.getCapabilities().GL_EXT_framebuffer_object }));
            minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, arrayList));
        }
        else if (liIlIIIlIllIlIllIIIl instanceof IIlIIIIlllIlllllIlII) {
            if (((IIlIIIIlllIlllllIlII)liIlIIIlIllIlIllIIIl).llllIIIIlIIIlIlllIll().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
                minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl));
            }
            else {
                minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI));
            }
        }
        else if (!liIlIIIlIllIlIllIIIl.IlIlIllllllllIIIIlII() && liIlIIIlIllIlIllIIIl.IIlllIlIIllIlIlIlIIl() == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch (llllIIIlIlllIlIIIIIl()[net.minecraft.IlllllllIIIlIIIlIlII.c.llllIIIIlIIIlIlllIll().ordinal()]) {
                case 3: {
                    minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl));
                    break;
                }
                case 4: {
                    minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI));
                    break;
                }
                default: {
                    minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl));
                    break;
                }
            }
        }
        else if (!minecraft.IIIIIIIIIlllIllIlIlI().containsKey((Object)"twitch_access_token")) {
            if (minecraft.IIIIIllIIIIlIIIIllIl().IllIIlllIIIIlllIIlIl() == IlIllIIllIIlIIIIlIIl.llllIIIIlIIIlIlllIll) {
                minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl));
            }
            else {
                minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII));
            }
        }
        else if (!liIlIIIlIllIlIllIIIl.llIIIlIlIllIIlIlIlII()) {
            switch (lIIIIlIIIIIlllIllIII()[liIlIIIlIllIlIllIIIl.lIllllllIIllIlIlIlII().ordinal()]) {
                case 2: {
                    minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII));
                    break;
                }
                default: {
                    minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl));
                    break;
                }
            }
        }
        else if (liIlIIIlIllIlIllIIIl.IIlllIlIIllIlIlIlIIl() != null) {
            minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI, Arrays.asList(new IIllIIllIIIlIlIIIIlI("stream.unavailable.initialization_failure.extra", new Object[] { ErrorCode.getString(liIlIIIlIllIlIllIIIl.IIlllIlIIllIlIlIlIIl()) }))));
        }
        else {
            minecraft.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(liIllIIIllllIlllIllI, net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI));
        }
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] llIllIlIIIIllIlIIllI = IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI;
        if (llIllIlIIIIllIlIIllI != null) {
            return llIllIlIIIIllIlIIllI;
        }
        final int[] llIllIlIIIIllIlIIllI2 = new int[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.values().length];
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            llIllIlIIIIllIlIIllI2[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        return IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI2;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] lIlIlIIIllIIllIIIllI = IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI != null) {
            return lIlIlIIIllIIllIIIllI;
        }
        final int[] lIlIlIIIllIIllIIIllI2 = new int[d.values().length];
        try {
            lIlIlIIIllIIllIIIllI2[d.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIlIlIIIllIIllIIIllI2[d.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIlIlIIIllIIllIIIllI2[d.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lIlIlIIIllIIllIIIllI2[d.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lIlIlIIIllIIllIIIllI2[d.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI2;
    }
    
    static /* synthetic */ int[] lIIIIlIIIIIlllIllIII() {
        final int[] iiIlIIIlIlIIlllIIlll = IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll;
        if (iiIlIIIlIlIIlllIIlll != null) {
            return iiIlIIIlIlIIlllIIlll;
        }
        final int[] iiIlIIIlIlIIlllIIlll2 = new int[IIIIlllIIIIIIlIIIlll.values().length];
        try {
            iiIlIIIlIlIIlllIIlll2[IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iiIlIIIlIlIIlllIIlll2[IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        return IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll2;
    }
}
