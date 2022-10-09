package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.client.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IlIIIlIlIIIllIlIlIIl implements net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, IlIlIlIlIlllllllllIl
{
    private final List llllIIIIlIIIlIlllIll;
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        final Iterator<lIIIlllIIIllIIIllIII> iterator = Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl().IlIlIIIllIllIIIIIllI().iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll.add(new IlIlIIIllIllIIIIIllI(this, iterator.next()));
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return new IlIlIIIIIIlllIlIllIl("Select a team to teleport to");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIIIIlllIlIllIl("Teleport to team member");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIIIllIllIIIIIllI);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        final Iterator<IlIlIlIlIlllllllllIl> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().IlIIIlIlIIIllIlIlIIl()) {
                return true;
            }
        }
        return false;
    }
}
