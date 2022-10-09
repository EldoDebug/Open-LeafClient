package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public abstract class IIIlIIIlIlIIlllIIlll implements IIIIIIIIIlllIllIlIlI
{
    private static final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private static final llIIIIIIlIllIIlIIIll IlIIIlIlIIIllIlIlIIl;
    private static final llIIIIIIlIllIIlIIIll IlIlIIIllIllIIIIIllI;
    private static final llIIIIIIlIllIIlIIIll IllIIlllIIIIlllIIlIl;
    protected final Minecraft llllIIIIlIIIlIlllIll;
    protected final IIIIIIIllllIlIIIIIII IlIlIlIlIlllllllllIl;
    
    static {
        llIllIIIIIllIlIIIIlI = new lIllllIllIllIIllllll("textures/gui/resource_packs.png");
        IlIIIlIlIIIllIlIlIIl = new IIllIIllIIIlIlIIIIlI("resourcePack.incompatible", new Object[0]);
        IlIlIIIllIllIIIIIllI = new IIllIIllIIIlIlIIIIlI("resourcePack.incompatible.old", new Object[0]);
        IllIIlllIIIIlllIIlIl = new IIllIIllIIIlIlIIIIlI("resourcePack.incompatible.new", new Object[0]);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IIIIIIIllllIlIIIIIII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll != 1) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2 - 1, n3 - 1, n2 + n4 - 9, n3 + n5 + 1, -8978432);
        }
        this.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        String s = this.llIllIIIIIllIlIIIIlI();
        String s2 = this.IlIlIlIlIlllllllllIl();
        if ((this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl || b) && this.IlIlIIIllIllIIIIIllI()) {
            this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI);
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, n2 + 32, n3 + 32, -1601138544);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final int n8 = n6 - n2;
            final int n9 = n7 - n3;
            if (llllIIIIlIIIlIlllIll < 1) {
                s = IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII();
                s2 = IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII();
            }
            else if (llllIIIIlIIIlIlllIll > 1) {
                s = IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII();
                s2 = IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII();
            }
            if (this.IllIIlllIIIIlllIIlIl()) {
                if (n8 < 32) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            else {
                if (this.llllIIIlIlllIlIIIIIl()) {
                    if (n8 < 16) {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.lIIIIlIIIIIlllIllIII()) {
                    if (n8 < 32 && n8 > 16 && n9 < 16) {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.lIIIlllIIIllIIIllIII()) {
                    if (n8 < 32 && n8 > 16 && n9 > 16) {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    }
                    else {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        if (this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s) > 157) {
            s = String.valueOf(this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, 157 - this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("..."))) + "...";
        }
        this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(n2 + 32 + 2), (float)(n3 + 1), 16777215);
        final List llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(s2, 157);
        for (int n10 = 0; n10 < 2 && n10 < llIllIIIIIllIlIIIIlI.size(); ++n10) {
            this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.get(n10), (float)(n2 + 32 + 2), (float)(n3 + 12 + 10 * n10), 8421504);
        }
    }
    
    protected abstract int llllIIIIlIIIlIlllIll();
    
    protected abstract String IlIlIlIlIlllllllllIl();
    
    protected abstract String llIllIIIIIllIlIIIIlI();
    
    protected abstract void IlIIIlIlIIIllIlIlIIl();
    
    protected boolean IlIlIIIllIllIIIIIllI() {
        return true;
    }
    
    protected boolean IllIIlllIIIIlllIIlIl() {
        return !this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    protected boolean llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    protected boolean lIIIIlIIIIIlllIllIII() {
        final List ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this);
        final int index = ilIlIlIlIlllllllllIl.indexOf(this);
        return index > 0 && ilIlIlIlIlllllllllIl.get(index - 1).IlIlIIIllIllIIIIIllI();
    }
    
    protected boolean lIIIlllIIIllIIIllIII() {
        final List ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this);
        final int index = ilIlIlIlIlllllllllIl.indexOf(this);
        return index >= 0 && index < ilIlIlIlIlllllllllIl.size() - 1 && ilIlIlIlIlllllllllIl.get(index + 1).IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (this.IlIlIIIllIllIIIIIllI() && n5 <= 32) {
            if (this.IllIIlllIIIIlllIIlIl()) {
                this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
                if (llllIIIIlIIIlIlllIll != 1) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new b(new IlIlIIIlIIlIlIIlllIl(this), llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("resourcePack.incompatible.confirm.title", new Object[0]), llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("resourcePack.incompatible.confirm." + ((llllIIIIlIIIlIlllIll > 1) ? "new" : "old"), new Object[0]), 0));
                }
                else {
                    this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this).remove(this);
                    this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl().add(0, this);
                }
                return true;
            }
            if (n5 < 16 && this.llllIIIlIlllIlIIIIIl()) {
                this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this).remove(this);
                this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().add(0, this);
                this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                return true;
            }
            if (n5 > 16 && n6 < 16 && this.lIIIIlIIIIIlllIllIII()) {
                final List ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this);
                final int index = ilIlIlIlIlllllllllIl.indexOf(this);
                ilIlIlIlIlllllllllIl.remove(this);
                ilIlIlIlIlllllllllIl.add(index - 1, this);
                this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                return true;
            }
            if (n5 > 16 && n6 > 16 && this.lIIIlllIIIllIIIllIII()) {
                final List ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this);
                final int index2 = ilIlIlIlIlllllllllIl2.indexOf(this);
                ilIlIlIlIlllllllllIl2.remove(this);
                ilIlIlIlIlllllllllIl2.add(index2 + 1, this);
                this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    }
}
