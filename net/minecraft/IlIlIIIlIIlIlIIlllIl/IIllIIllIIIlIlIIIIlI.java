package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class IIllIIllIIIlIlIIIIlI extends IlIIIlIlIIIllIlIlIIl implements IlIlIIIllIIllIlllllI, llIIIllIlIllIllIIIIl
{
    public int IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public float lIlIlIIIllIIllIIIllI;
    public float IlIlIIIllIIllIlllllI;
    public float IIIIlllIIIIIIlIIIlll;
    private static Random llllIIllllIlIlIIIIll;
    private String IlIllIlIlIIIlIlIlIII;
    
    static {
        IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll = new Random();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (this.w_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IlIllIlIlIIIlIlIlIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8)) {
            this.IlIllIlIlIIIlIlIlIII = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = this.lIlIlIIIllIIllIIIllI;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, 3.0);
        if (llllIIIIlIIIlIlllIll != null) {
            this.IIIIlllIIIIIIlIIIlll = (float)llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - (this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f), llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - (this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f));
            this.llIIlIIIlIIIllIlIIIl += 0.1f;
            if (this.llIIlIIIlIIIllIlIIIl < 0.5f || IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll.nextInt(40) == 0) {
                do {
                    this.lIIIIlIIIIIlllIllIII += IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll.nextInt(4) - IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll.nextInt(4);
                } while (this.lIIIIlIIIIIlllIllIII == this.lIIIIlIIIIIlllIllIII);
            }
        }
        else {
            this.IIIIlllIIIIIIlIIIlll += 0.02f;
            this.llIIlIIIlIIIllIlIIIl -= 0.1f;
        }
        while (this.lIlIlIIIllIIllIIIllI >= 3.1415927f) {
            this.lIlIlIIIllIIllIIIllI -= 6.2831855f;
        }
        while (this.lIlIlIIIllIIllIIIllI < -3.1415927f) {
            this.lIlIlIIIllIIllIIIllI += 6.2831855f;
        }
        while (this.IIIIlllIIIIIIlIIIlll >= 3.1415927f) {
            this.IIIIlllIIIIIIlIIIlll -= 6.2831855f;
        }
        while (this.IIIIlllIIIIIIlIIIlll < -3.1415927f) {
            this.IIIIlllIIIIIIlIIIlll += 6.2831855f;
        }
        float n;
        for (n = this.IIIIlllIIIIIIlIIIlll - this.lIlIlIIIllIIllIIIllI; n >= 3.1415927f; n -= 6.2831855f) {}
        while (n < -3.1415927f) {
            n += 6.2831855f;
        }
        this.lIlIlIIIllIIllIIIllI += n * 0.4f;
        this.llIIlIIIlIIIllIlIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, 0.0f, 1.0f);
        ++this.IlIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
        final float n2 = (this.lIIIIlIIIIIlllIllIII - this.IllIIlllIIIIlllIIlIl) * 0.4f;
        final float n3 = 0.2f;
        this.lIIIlllIIIllIIIllIII += (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2, -n3, n3) - this.lIIIlllIIIllIIIllIII) * 0.9f;
        this.IllIIlllIIIIlllIIlIl += this.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IlIllIlIlIIIlIlIlIII : "container.enchant";
    }
    
    @Override
    public boolean w_() {
        return this.IlIllIlIlIIIlIlIlIII != null && this.IlIllIlIlIIIlIlIlIII.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new llIIlIIIlIIIllIlIIIl(illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:enchanting_table";
    }
}
