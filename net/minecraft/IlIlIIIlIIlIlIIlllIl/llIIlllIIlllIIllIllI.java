package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.gson.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlllIIlllIIllIllI extends IlIIIlIlIIIllIlIlIIl
{
    public final llIIIIIIlIllIIlIIIll[] IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private final llIIIlIlIllIIlIlIlII lIIIlllIIIllIIIllIII;
    
    public llIIlllIIlllIIllIllI() {
        this.IlIlIIIllIllIIIIIllI = new llIIIIIIlIllIIlIIIll[] { new IlIlIIIIIIlllIlIllIl(""), new IlIlIIIIIIlllIlIllIl(""), new IlIlIIIIIIlllIlIllIl(""), new IlIlIIIIIIlllIlIllIl("") };
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIlllIIIllIIIllIII = new llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        for (int i = 0; i < 4; ++i) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Text" + (i + 1), lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI[i]));
        }
        this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIlIlllIlIIIIIl = false;
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII = new IIlllIIIlIlllIIlllII(this);
        for (int i = 0; i < 4; ++i) {
            final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Text" + (i + 1));
            try {
                final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll = lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
                try {
                    this.IlIlIIIllIllIIIIIllI[i] = IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, llllIIIIlIIIlIlllIll, null);
                }
                catch (net.minecraft.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2) {
                    this.IlIlIIIllIllIIIIIllI[i] = llllIIIIlIIIlIlllIll;
                }
            }
            catch (JsonParseException ex) {
                this.IlIlIIIllIllIIIIIllI[i] = new IlIlIIIIIIlllIlIllIl(llIIlIIIlIIIllIlIIIl);
            }
        }
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final llIIIIIIlIllIIlIIIll[] array = new llIIIIIIlIllIIlIIIll[4];
        System.arraycopy(this.IlIlIIIllIllIIIIIllI, 0, array, 0, 4);
        return new IlIIllIIllIIllIIlIIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, array);
    }
    
    @Override
    public boolean IlIlIIIIIIlllIlIllIl() {
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIlIlllIlIIIIIl) {
        if (!(this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl)) {
            this.lIIIIlIIIIIlllIllIII = null;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = new net.minecraft.IlIlIIIlIIlIlIIlllIl.IIlIIIIIllIlIIIlIIll(this, llllIIIIlIIIlIlllIll);
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (this.IlIlIIIllIllIIIIIllI[i] == null) ? null : this.IlIlIIIllIllIIIIIllI[i].llllIIIlIlllIlIIIIIl();
            if (ilIlIIIlIIlIlIIlllIl != null && ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII() != null) {
                final net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII = ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII();
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                    net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIllllIIIlIIIIIIllIl().llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                }
            }
        }
        return true;
    }
    
    public llIIIlIlIllIIlIlIlII llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
}
