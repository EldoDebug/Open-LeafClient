package net.optifine.llllIIIlIlllIlIIIIIl;

import java.awt.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.awt.image.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class lIIIIlIIIIIlllIllIII
{
    private Dimension lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private llIIlIIIlIIIllIlIIIl[] llIIlIIIlIIIllIlIIIl;
    private lIllllIllIllIIllllll llIllIlIIIIllIlIIllI;
    private BufferedImage lIlIlIIIllIIllIIIllI;
    private IlIlIlIlIlllllllllIl IlIlIIIllIIllIlllllI;
    private lIllllIllIllIIllllll IIIIlllIIIIIIlIIIlll;
    public static final int llllIIIIlIIIlIlllIll = 0;
    public static final int IlIlIlIlIlllllllllIl = 1;
    public static final int llIllIIIIIllIlIIIIlI = 2;
    public static final int IlIIIlIlIIIllIlIlIIl = 3;
    public static final int IlIlIIIllIllIIIIIllI = 4;
    public static final int IllIIlllIIIIlllIIlIl = 5;
    public static final int llllIIIlIlllIlIIIIIl = 6;
    
    public lIIIIlIIIIIlllIllIII(final Dimension liiiIlIIIIIlllIllIII, final boolean liiIlllIIIllIIIllIII, final llIIlIIIlIIIllIlIIIl[] llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = false;
        this.llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl[0];
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = new lIllllIllIllIIllllll("textures/blocks/wool_colored_red.png");
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2) {
        final IIlllIIlIllIllIlIIll llIIIlIlllIllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI();
        if (this.lIIIlllIIIllIIIllIII) {
            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        }
        else if (this.llIllIlIIIIllIlIIllI != null) {
            if (this.IlIlIIIllIIllIlllllI == null && this.lIlIlIIIllIIllIIIllI != null) {
                this.IlIlIIIllIIllIlllllI = new IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI);
                Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.IlIlIIIllIIllIlllllI);
            }
            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
        }
        else {
            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
        }
        for (int i = 0; i < this.llIIlIIIlIIIllIlIIIl.length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl[i];
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.2f, 0.0f);
            }
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    public static IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        switch (n) {
            case 0: {
                return illIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI;
            }
            case 1: {
                return illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI;
            }
            case 2: {
                return illIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll;
            }
            case 3: {
                return illIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll;
            }
            case 4: {
                return illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll;
            }
            case 5: {
                return illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII;
            }
            default: {
                return null;
            }
        }
    }
    
    public BufferedImage llllIIIIlIIIlIlllIll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final BufferedImage lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
}
