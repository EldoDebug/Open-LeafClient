package net.minecraft.client.IlIlIlIlIlllllllllIl;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import com.mojang.authlib.*;
import net.optifine.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.io.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llllIIIIlIIIlIlllIll extends net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll
{
    private IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    private lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private long IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private static final lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIIlIIIIIlllIllIII = new lIllllIllIllIIllllll("textures/entity/elytra.png");
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final GameProfile gameProfile) {
        super(illlllllIIIlIIIlIlII, gameProfile);
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = 0L;
        this.IllIIlllIIIIlllIIlIl = false;
        this.llllIIIlIlllIlIIIIIl = null;
        this.llllIIIlIlllIlIIIIIl = gameProfile.getName();
        if (this.llllIIIlIlllIlIIIIIl != null && !this.llllIIIlIlllIlIIIIIl.isEmpty()) {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        }
        net.optifine.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
        net.optifine.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(this.r().getId());
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() == net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl() != null;
    }
    
    protected IIIIlllIIIIIIlIIIlll IllIIlllIIIIlllIIlIl() {
        if (this.llllIIIIlIIIlIlllIll == null) {
            this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl());
        }
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        final IIIIlllIIIIIIlIIIlll illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        return illIIlllIIIIlllIIlIl != null && illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    public lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII() {
        final IIIIlllIIIIIIlIIIlll illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        return (illIIlllIIIIlllIIlIl == null) ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl()) : illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
    }
    
    public lIllllIllIllIIllllll lIIIlllIIIllIIIllIII() {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl()) {
            return null;
        }
        if (this.IlIlIIIllIllIIIIIllI != 0L && System.currentTimeMillis() > this.IlIlIIIllIllIIIIIllI) {
            net.optifine.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this);
            this.IlIlIIIllIllIIIIIllI = 0L;
        }
        if (this.IlIlIlIlIlllllllllIl != null) {
            return this.IlIlIlIlIlllllllllIl;
        }
        final IIIIlllIIIIIIlIIIlll illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        return (illIIlllIIIIlllIIlIl == null) ? null : illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
    }
    
    public lIllllIllIllIIllllll llIIlIIIlIIIllIlIIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public lIllllIllIllIIllllll llIllIlIIIIllIlIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        final IIlllIIlIllIllIlIIll lllIllIIIllllllIllll = Minecraft.getMinecraft().lllIllIIIllllllIllll();
        IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = new IlIIlllllIIllIIlllll(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(s)), net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(s)), new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIlIIllIllIIlIllII());
            lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIlIlIlIlllllllllIl);
        }
        return (IlIIlllllIIllIIlllll)ilIlIlIlIlllllllllIl;
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s) {
        return new lIllllIllIllIIllllll("skins/" + lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(s));
    }
    
    public String lIlIlIIIllIIllIIIllI() {
        final IIIIlllIIIIIIlIIIlll illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        return (illIIlllIIIIlllIIlIl == null) ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.lllIIIIlIlIllIIlIIIl()) : illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI();
    }
    
    public float IlIlIIIllIIllIlllllI() {
        float n = 1.0f;
        if (this.K.IlIlIlIlIlllllllllIl) {
            n *= 1.1f;
        }
        float n2 = (float)(n * ((this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI() / this.K.IlIlIlIlIlllllllllIl() + 1.0) / 2.0));
        if (this.K.IlIlIlIlIlllllllllIl() == 0.0f || Float.isNaN(n2) || Float.isInfinite(n2)) {
            n2 = 1.0f;
        }
        if (this.g() && this.e().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl) {
            final float n3 = this.h() / 20.0f;
            float n4;
            if (n3 > 1.0f) {
                n4 = 1.0f;
            }
            else {
                n4 = n3 * n3;
            }
            n2 *= 1.0f - n4 * 0.15f;
        }
        return net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.a.llIllIIIIIllIlIIIIlI() ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.a, this, n2) : n2;
    }
    
    public void IIIIlllIIIIIIlIIIlll() {
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        net.optifine.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIllllIlIlIIIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public lIllllIllIllIIllllll IlIllIlIlIIIlIlIlIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IIlllIIlIllIllIlIIll() {
        final lIllllIllIllIIllllll liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII();
        return liiIlllIIIllIIIllIII != null && (liiIlllIIIllIIIllIII != this.IlIlIlIlIlllllllllIl || this.IllIIlllIIIIlllIIlIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public boolean lllIIIIlllllIlIIllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public long IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final long ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public e llllIIIIlIIIlIlllIll(final float n) {
        return this.IlIlIIIllIllIIIIIllI(this.llllllIllIllIlIllllI, this.IIlIIIIIllIlIIIlIIll);
    }
}
