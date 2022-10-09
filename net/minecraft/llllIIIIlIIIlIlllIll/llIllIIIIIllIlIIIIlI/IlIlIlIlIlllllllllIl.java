package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.base.*;
import com.google.common.collect.*;

public class IlIlIlIlIlllllllllIl
{
    private static final Joiner llllIIIIlIIIlIlllIll;
    private static final Function IlIlIlIlIlllllllllIl;
    private final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final ImmutableList IlIIIlIlIIIllIlIlIIl;
    private final ImmutableList IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = Joiner.on(", ");
        IlIlIlIlIlllllllllIl = (Function)new llIllIIIIIllIlIIIIlI();
    }
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI, final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll... array) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        Arrays.sort(array, new IlIIIlIlIIIllIlIlIIl(this));
        this.IlIIIlIlIIIllIlIlIIl = ImmutableList.copyOf((Object[])array);
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<List> iterator = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI()).iterator();
        while (iterator.hasNext()) {
            final Map llllIIIIlIIIlIlllIll = IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll((Iterable)this.IlIIIlIlIIIllIlIlIIl, iterator.next());
            final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI, ImmutableMap.copyOf(llllIIIIlIIIlIlllIll), null);
            linkedHashMap.put(llllIIIIlIIIlIlllIll, ilIlIIIllIllIIIIIllI);
            arrayList.add(ilIlIIIllIllIIIIIllI);
        }
        final Iterator<IlIlIIIllIllIIIIIllI> iterator2 = (Iterator<IlIlIIIllIllIIIIIllI>)arrayList.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().llllIIIIlIIIlIlllIll(linkedHashMap);
        }
        this.IlIlIIIllIllIIIIIllI = ImmutableList.copyOf((Collection)arrayList);
    }
    
    public ImmutableList llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    private List IlIlIIIllIllIIIIIllI() {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
            arrayList.add(((net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)this.IlIIIlIlIIIllIlIlIIl.get(i)).IlIlIlIlIlllllllllIl());
        }
        return arrayList;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl() {
        return (llIIlIIIlIIIllIlIIIl)this.IlIlIIIllIllIIIIIllI.get(0);
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public Collection IlIIIlIlIIIllIlIlIIl() {
        return (Collection)this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("block", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI)).add("properties", (Object)Iterables.transform((Iterable)this.IlIIIlIlIIIllIlIlIIl, net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl)).toString();
    }
}
