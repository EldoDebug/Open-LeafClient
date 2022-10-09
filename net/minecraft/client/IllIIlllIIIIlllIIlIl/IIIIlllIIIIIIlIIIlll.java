package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import com.mojang.authlib.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import com.google.common.base.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.client.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IIIIlllIIIIIIlIIIlll
{
    private final GameProfile llllIIIIlIIIlIlllIll;
    private lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private llIIIIIIlIllIIlIIIll lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private long llIllIlIIIIllIlIIllI;
    private long lIlIlIIIllIIllIIIllI;
    private long IlIlIIIllIIllIlllllI;
    
    public IIIIlllIIIIIIlIIIlll(final GameProfile llllIIIIlIIIlIlllIll) {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.llIllIlIIIIllIlIIllI = 0L;
        this.lIlIlIIIllIIllIIIllI = 0L;
        this.IlIlIIIllIIllIlllllI = 0L;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IIIIlllIIIIIIlIIIlll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.llIllIlIIIIllIlIIllI = 0L;
        this.lIlIlIIIllIIllIIIllI = 0L;
        this.IlIlIIIllIIllIlllllI = 0L;
        this.llllIIIIlIIIlIlllIll = illlIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl = illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        this.lIIIIlIIIIIlllIllIII = illlIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl();
    }
    
    public GameProfile llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    protected void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI != null;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return (this.llllIIIlIlllIlIIIIIl == null) ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.getId()) : this.llllIIIlIlllIlIIIIIl;
    }
    
    public lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl() {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.lIIIlllIIIllIIIllIII();
        }
        return (lIllllIllIllIIllllll)Objects.firstNonNull((Object)this.IlIlIIIllIllIIIIIllI, (Object)net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.getId()));
    }
    
    public lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl() {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            this.lIIIlllIIIllIIIllIII();
        }
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public lIIIlllIIIllIIIllIII lIIIIlIIIIIlllIllIII() {
        return Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl().IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll().getName());
    }
    
    protected void lIIIlllIIIllIIIllIII() {
        synchronized (this) {
            if (!this.IlIIIlIlIIIllIlIlIIl) {
                this.IlIIIlIlIIIllIlIlIIl = true;
                Minecraft.getMinecraft().llIIIIIIlIllIIlIIIll().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, new llllIIllllIlIlIIIIll(this), true);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public llIIIIIIlIllIIlIIIll llIIlIIIlIIIllIlIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int llIllIlIIIIllIlIIllI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final int liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public long IlIlIIIllIIllIlllllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final long llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public long IIIIlllIIIIIIlIIIlll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final long lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public long llllIIllllIlIlIIIIll() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final long ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
}
