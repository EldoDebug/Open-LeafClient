package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllIIIIlllllIlIIllIl extends IlIlIIIllIllIIIIIllI
{
    private IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll;
    private IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public lllIIIIlllllIlIIllIl(final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() >= 0) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
            return false;
        }
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.class, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(6.0, 2.0, 6.0));
        if (llllIIIIlIIIlIlllIll.isEmpty()) {
            return false;
        }
        for (final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl : llllIIIIlIIIlIlllIll) {
            if (ilIlIlIlIlllllllllIl.ao() > 0) {
                this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                break;
            }
        }
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.ao() > 0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.B().nextInt(320);
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 30.0f, 30.0f);
        if (this.IlIlIlIlIlllllllllIl.ao() == this.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0.5);
            this.IlIIIlIlIIIllIlIlIIl = true;
        }
        if (this.IlIIIlIlIIIllIlIlIIl && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) < 4.0) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false);
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        }
    }
}
