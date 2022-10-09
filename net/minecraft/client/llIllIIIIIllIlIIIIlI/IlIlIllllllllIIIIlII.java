package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIllllllllIIIIlII extends lIIllIIIllllIlllIllI implements c
{
    private int IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    
    public IlIlIllllllllIIIIlII() {
        this.IllIIlllIIIIlllIIlIl = false;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.clear();
        if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
            if (this.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.deleteWorld", new Object[0])));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.leaveServer", new Object[0])));
            }
        }
        else {
            this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(0, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 72, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.respawn", new Object[0])));
            this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 4 + 96, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.titleScreen", new Object[0])));
            if (this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl() == null) {
                this.IIlllIIlIllIllIlIIll.get(1).lIlIlIIIllIIllIIIllI = false;
            }
        }
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.IIlllIIlIllIllIlIIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().lIlIlIIIllIIllIIIllI = false;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
            case 0: {
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
                break;
            }
            case 1: {
                if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lllIllIIIllllllIllll());
                    break;
                }
                final b b = new b(this, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.quit.confirm", new Object[0]), "", net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.titleScreen", new Object[0]), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.respawn", new Object[0]), 0);
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(b);
                b.llllIIIIlIIIlIlllIll(20);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (b) {
            this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl)null);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lllIllIIIllllllIllll());
        }
        else {
            this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIIlIIlIIIIlllIlllII();
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.llllIIIIlIIIlIlllIll(0, 0, this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, 1615855616, -1602211792);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
        final boolean ilIlIIIIIIlllIlIllIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, ilIlIIIIIIlllIlIllIl ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.title.hardcore", new Object[0]) : net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.title", new Object[0]), this.llllIIllllIlIlIIIIll / 2 / 2, 30, 16777215);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (ilIlIIIIIIlllIlIllIl) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.hardcoreInfo", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 144, 16777215);
        }
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("deathScreen.score", new Object[0])) + ": " + IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll + this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.m(), this.llllIIllllIlIlIIIIll / 2, 100, 16777215);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        ++this.IlIlIIIllIllIIIIIllI;
        if (this.IlIlIIIllIllIIIIIllI == 20) {
            final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.IIlllIIlIllIllIlIIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().lIlIlIIIllIIllIIIllI = true;
            }
        }
    }
}
