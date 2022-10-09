package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll implements IlIIIlIlIIIllIlIlIIl
{
    private final List llllIIIIlIIIlIlllIll;
    
    public llllIIIIlIIIlIlllIll() {
        (this.llllIIIIlIIIlIlllIll = Lists.newArrayList()).add(new IlIlIlIlIlllllllllIl());
        this.llllIIIIlIIIlIlllIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return new IlIlIIIIIIlllIlIllIl("Press a key to select a command, and again to use it.");
    }
}
