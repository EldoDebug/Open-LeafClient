package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.client.*;
import com.google.common.collect.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIlIlIlIlllllllllIl implements IlIIIlIlIIIllIlIlIIl, net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl
{
    private static final Ordering llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Ordering.from((Comparator)new llIllIIIIIllIlIIIIlI());
    }
    
    public IlIlIlIlIlllllllllIl() {
        this(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.sortedCopy((Iterable)Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llIllIIIIIllIlIIIIlI()));
    }
    
    public IlIlIlIlIlllllllllIl(final Collection collection) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        for (final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll : net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.sortedCopy((Iterable)collection)) {
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl() != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                this.IlIlIlIlIlllllllllIl.add(new IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll()));
            }
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return new IlIlIIIIIIlllIlIllIl("Select a player to teleport to");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIIIIlllIlIllIl("Teleport to player");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIIIllIllIIIIIllI);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 0.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return !this.IlIlIlIlIlllllllllIl.isEmpty();
    }
}
