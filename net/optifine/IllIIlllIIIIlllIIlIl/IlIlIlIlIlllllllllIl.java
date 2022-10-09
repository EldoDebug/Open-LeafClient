package net.optifine.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends IlIIIlIlIIIllIlIlIIl
{
    private boolean llllIIIIlIIIlIlllIll;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl(final Minecraft minecraft, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        super(minecraft, liiiIlIIIIIlllIllIII);
        this.llllIIIIlIIIlIlllIll = false;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final boolean ilIlIlIlIlllllllllIl2 = super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = false;
        return ilIlIlIlIlllllllllIl2;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final boolean llIllIIIIIllIlIIIIlI = super.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = false;
        return llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll = true;
        final boolean llllIIIIlIIIlIlllIll2 = super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, lllIIIIlIlIllIIlIIIl);
        this.llllIIIIlIIIlIlllIll = false;
        return llllIIIIlIIIlIlllIll2;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final e e) {
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final boolean llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl, lllIIIIlIlIllIIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, e);
        this.llllIIIIlIIIlIlllIll = false;
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, llIlllIlllllIIllIIII);
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIllllIlIlIIIIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIllIIIIIllIlIIIIlI IlIllIlIlIIIlIlIlIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
