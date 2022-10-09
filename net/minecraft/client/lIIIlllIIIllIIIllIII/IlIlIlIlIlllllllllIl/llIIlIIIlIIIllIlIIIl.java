package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import com.google.common.util.concurrent.*;
import java.util.*;
import java.util.concurrent.*;
import net.minecraft.client.*;

class llIIlIIIlIIIllIlIIIl implements FutureCallback
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final /* synthetic */ llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI;
    
    llIIlIIIlIIIllIlIIIl(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().lock();
        Label_0129: {
            try {
                if (this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
                    break Label_0129;
                }
                if (!this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII()) {
                    lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.warn("Chunk render task was " + this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() + " when I expected it to be uploading; aborting task");
                }
            }
            finally {
                this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().unlock();
            }
            this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().unlock();
            return;
        }
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void onFailure(final Throwable t) {
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        if (!(t instanceof CancellationException) && !(t instanceof InterruptedException)) {
            Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering chunk"));
        }
    }
}
