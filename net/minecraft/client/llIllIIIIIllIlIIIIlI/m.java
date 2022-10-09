package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import com.google.common.collect.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import java.util.*;

public class m extends IIIIIllIIIIlIIIIllIl
{
    private final IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final List IlllllllIIIlIIIlIlII;
    private final IIIIIIIIIlllIllIlIlI IIlIIIIlllIlllllIlII;
    private int IIIlIIlIIIIlllIlllII;
    
    public m(final IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll, final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(minecraft, n, n2, n3, n4, n5);
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.IlllllllIIIlIIIlIlII = Lists.newArrayList();
        this.IIlIIIIlllIlllllIlII = new j();
        this.IIIlIIlIIIIlllIlllII = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public IIIIIIIIIlllIllIlIlI IlIlIlIlIlllllllllIl(int n) {
        if (n < this.IlIlIlIlIlllllllllIl.size()) {
            return this.IlIlIlIlIlllllllllIl.get(n);
        }
        n -= this.IlIlIlIlIlllllllllIl.size();
        if (n == 0) {
            return this.IIlIIIIlllIlllllIlII;
        }
        --n;
        return this.IlllllllIIIlIIIlIlII.get(n);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size() + 1 + this.IlllllllIIIlIIIlIlII.size();
    }
    
    public void llIllIIIIIllIlIIIIlI(final int iiIlIIlIIIIlllIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return n == this.IIIlIIlIIIIlllIlllII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.IlIlIlIlIlllllllllIl.clear();
        for (int i = 0; i < liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(); ++i) {
            this.IlIlIlIlIlllllllllIl.add(new k(this.llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(i)));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.IlllllllIIIlIIIlIlII.clear();
        final Iterator<IlIlIlIlIlllllllllIl> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.IlllllllIIIlIIIlIlII.add(new i(this.llllIIIIlIIIlIlllIll, iterator.next()));
        }
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return super.llllIIIlIlllIlIIIIIl() + 30;
    }
    
    @Override
    public int m_() {
        return super.m_() + 85;
    }
}
