package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.lllIIIIlllllIlIIllIl.*;
import com.google.common.collect.*;
import net.minecraft.client.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

class IlIlIIIllIllIIIIIllI implements IlIlIlIlIlllllllllIl
{
    private final lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl;
    private final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final lIIIlllIIIllIIIllIII ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        final Iterator<String> iterator = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().iterator();
        while (iterator.hasNext()) {
            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(iterator.next());
            if (llllIIIIlIIIlIlllIll2 != null) {
                this.IlIIIlIlIIIllIlIlIIl.add(llllIIIIlIIIlIlllIll2);
            }
        }
        if (!this.IlIIIlIlIIIllIlIlIIl.isEmpty()) {
            final String name = this.IlIIIlIlIIIllIlIlIIl.get(new Random().nextInt(this.IlIIIlIlIIIllIlIlIIl.size())).llllIIIIlIIIlIlllIll().getName();
            net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI = net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(name), name);
        }
        else {
            this.llIllIIIIIllIlIIIIlI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl));
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return new IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        int ilIlIlIlIlllllllllIl = -1;
        final String ilIlIlIlIlllllllllIl2 = FontRenderer.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        if (ilIlIlIlIlllllllllIl2.length() >= 2) {
            ilIlIlIlIlllllllllIl = Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.charAt(1));
        }
        if (ilIlIlIlIlllllllllIl >= 0) {
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1, 1, 15, 15, llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((ilIlIlIlIlllllllllIl >> 16 & 0xFF) / 255.0f * n, (ilIlIlIlIlllllllllIl >> 8 & 0xFF) / 255.0f * n, (ilIlIlIlIlllllllllIl & 0xFF) / 255.0f * n) | n2 << 24);
        }
        Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n, n, n2 / 255.0f);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return !this.IlIIIlIlIIIllIlIlIIl.isEmpty();
    }
}
