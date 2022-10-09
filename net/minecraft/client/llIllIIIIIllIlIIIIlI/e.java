package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class e
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/map/map_icons.png");
    }
    
    public e(final IIlllIIlIllIllIlIIll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final boolean b) {
        this.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll(b);
    }
    
    private f IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        f f = this.llIllIIIIIllIlIIIIlI.get(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
        if (f == null) {
            f = new f(this, illIIlllIIIIlllIIlIl, null);
            this.llIllIIIIIllIlIIIIlI.put(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, f);
        }
        return f;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final Iterator<f> iterator = this.llIllIIIIIllIlIIIIlI.values().iterator();
        while (iterator.hasNext()) {
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(iterator.next().IlIIIlIlIIIllIlIlIIl);
        }
        this.llIllIIIIIllIlIIIIlI.clear();
    }
}
