package net.optifine.expr;

import java.io.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    public IlIIIlIlIIIllIlIlIIl(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final String s) {
        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        if (!(llIllIIIIIllIlIIIIlI instanceof IlIlIIIllIIllIlllllI)) {
            throw new IlIlIIIIIIlllIlIllIl("Not a float expression: " + llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
        return (IlIlIIIllIIllIlllllI)llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl(final String s) {
        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        if (!(llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI)) {
            throw new IlIlIIIIIIlllIlIllIl("Not a boolean expression: " + llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
        return (llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI;
    }
    
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final String s) {
        try {
            final IIllIIllIIIlIlIIIIlI[] llllIIIIlIIIlIlllIll = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(s);
            if (llllIIIIlIIIlIlllIll == null) {
                return null;
            }
            return this.llllIIIIlIIIlIlllIll(new ArrayDeque(Arrays.asList(llllIIIIlIIIlIlllIll)));
        }
        catch (IOException ex) {
            throw new IlIlIIIIIIlllIlIllIl(ex.getMessage(), ex);
        }
    }
    
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final Deque deque) {
        if (deque.isEmpty()) {
            return null;
        }
        final LinkedList<llIIlIIIlIIIllIlIIIl> list = new LinkedList<llIIlIIIlIIIllIlIIIl>();
        final LinkedList<IIllIIllIIIlIlIIIIlI> list2 = new LinkedList<IIllIIllIIIlIlIIIIlI>();
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(deque);
        llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "Missing expression");
        list.add(ilIlIlIlIlllllllllIl);
        while (true) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = deque.poll();
            if (illIIllIIIlIlIIIIlI == null) {
                return this.llllIIIIlIIIlIlllIll(list, list2);
            }
            if (illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() != IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI) {
                throw new IlIlIIIIIIlllIlIllIl("Invalid operator: " + illIIllIIIlIlIIIIlI);
            }
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(deque);
            llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, "Missing expression");
            list2.add(illIIllIIIlIlIIIIlI);
            list.add(ilIlIlIlIlllllllllIl2);
        }
    }
    
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final List list, final List list2) {
        final LinkedList<lIIIlllIIIllIIIllIII> list3 = new LinkedList<lIIIlllIIIllIIIllIII>();
        for (final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI : list2) {
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl());
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "Invalid operator: " + illIIllIIIlIlIIIIlI);
            list3.add(llllIIIIlIIIlIlllIll);
        }
        return this.IlIlIlIlIlllllllllIl(list, list3);
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final List list, final List list2) {
        if (list.size() != list2.size() + 1) {
            throw new IlIlIIIIIIlllIlIllIl("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII : list2) {
            min = Math.min(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), min);
            max = Math.max(liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), max);
        }
        if (max < min || max - min > 10) {
            throw new IlIlIIIIIIlllIlIllIl("Invalid infix precedence, min: " + min + ", max: " + max);
        }
        for (int i = max; i >= min; --i) {
            this.llllIIIIlIIIlIlllIll(list, list2, i);
        }
        if (list.size() == 1 && list2.size() == 0) {
            return list.get(0);
        }
        throw new IlIlIIIIIIlllIlIllIl("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
    }
    
    private void llllIIIIlIIIlIlllIll(final List list, final List list2, final int n) {
        for (int i = 0; i < list2.size(); ++i) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = list2.get(i);
            if (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl() == n) {
                list2.remove(i);
                list.add(i, llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, new llIIlIIIlIIIllIlIIIl[] { list.remove(i), list.remove(i) }));
                --i;
            }
        }
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final Deque deque) {
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = deque.poll();
        llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, "Missing expression");
        switch (llllIIIIlIIIlIlllIll()[illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 2: {
                return llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            }
            case 1: {
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, deque);
                if (llllIIIIlIIIlIlllIll != null) {
                    return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, deque);
                }
                return this.IlIlIlIlIlllllllllIl(illIIllIIIlIlIIIIlI);
            }
            case 5: {
                return this.IlIlIlIlIlllllllllIl(illIIllIIIlIlIIIIlI, deque);
            }
            case 3: {
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl());
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, "Invalid operator: " + illIIllIIIlIlIIIIlI);
                if (llllIIIIlIIIlIlllIll2 == lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll) {
                    return this.IlIlIlIlIlllllllllIl(deque);
                }
                if (llllIIIIlIIIlIlllIll2 == lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl) {
                    return llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl, new llIIlIIIlIIIllIlIIIl[] { this.IlIlIlIlIlllllllllIl(deque) });
                }
                if (llllIIIIlIIIlIlllIll2 == lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI) {
                    return llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI, new llIIlIIIlIIIllIlIIIl[] { this.IlIlIlIlIlllllllllIl(deque) });
                }
                break;
            }
        }
        throw new IlIlIIIIIIlllIlIllIl("Invalid expression: " + illIIllIIIlIlIIIIlI);
    }
    
    private static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(), Float.NaN);
        if (llllIIIIlIIIlIlllIll == Float.NaN) {
            throw new IlIlIIIIIIlllIlIllIl("Invalid float value: " + illIIllIIIlIlIIIIlI);
        }
        return new net.optifine.expr.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    private lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final Deque deque) {
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = deque.peek();
        if (illIIllIIIlIlIIIIlI2 != null && illIIllIIIlIlIIIIlI2.llllIIIIlIIIlIlllIll() == IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI) {
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl());
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "Unknown function: " + illIIllIIIlIlIIIIlI);
            return llllIIIIlIIIlIlllIll;
        }
        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl());
        if (llllIIIIlIIIlIlllIll2 == null) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl[0]) > 0) {
            throw new IlIlIIIIIIlllIlIllIl("Missing arguments: " + llllIIIIlIIIlIlllIll2);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final Deque deque) {
        if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl[0]) == 0) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = deque.peek();
            if (illIIllIIIlIlIIIIlI == null || illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() != IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI) {
                return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, new llIIlIIIlIIIllIlIIIl[0]);
            }
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = deque.poll();
        return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll(deque, IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl, true)));
    }
    
    private llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI(final Deque deque) {
        final ArrayList<llIIlIIIlIIIllIlIIIl> list = new ArrayList<llIIlIIIlIIIllIlIIIl>();
        while (true) {
            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(deque, IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl, false));
            if (llllIIIIlIIIlIlllIll == null) {
                break;
            }
            list.add(llllIIIIlIIIlIlllIll);
        }
        return list.toArray(new llIIlIIIlIIIllIlIIIl[list.size()]);
    }
    
    private static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final llIIlIIIlIIIllIlIIIl[] array) {
        final IlIlIIIllIllIIIIIllI[] ilIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(array);
        if (array.length != ilIlIlIlIlllllllllIl.length) {
            throw new IlIlIIIIIIlllIlIllIl("Invalid number of arguments, function: \"" + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() + "\", count arguments: " + array.length + ", should be: " + ilIlIlIlIlllllllllIl.length);
        }
        for (int i = 0; i < array.length; ++i) {
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = array[i].llllIIIIlIIIlIlllIll();
            final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl[i];
            if (llllIIIIlIIIlIlllIll != ilIlIIIllIllIIIIIllI) {
                throw new IlIlIIIIIIlllIlIllIl("Invalid argument type, function: \"" + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() + "\", index: " + i + ", type: " + llllIIIIlIIIlIlllIll + ", should be: " + ilIlIIIllIllIIIIIllI);
            }
        }
        if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
            return new llllIIIlIlllIlIIIIIl(liiIlllIIIllIIIllIII, array);
        }
        if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI) {
            return new IllIIlllIIIIlllIIlIl(liiIlllIIIllIIIllIII, array);
        }
        if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl) {
            return new lIIIIlIIIIIlllIllIII(liiIlllIIIllIIIllIII, array);
        }
        throw new IlIlIIIIIIlllIlIllIl("Unknown function type: " + liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() + ", function: " + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            throw new IlIlIIIIIIlllIlIllIl("Model variable not found: " + illIIllIIIlIlIIIIlI);
        }
        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl());
        if (llIllIIIIIllIlIIIIlI == null) {
            throw new IlIlIIIIIIlllIlIllIl("Model variable not found: " + illIIllIIIlIlIIIIlI);
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final Deque deque) {
        return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(deque, IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl, true));
    }
    
    private static Deque llllIIIIlIIIlIlllIll(final Deque deque, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final boolean b) {
        final ArrayDeque<IIllIIllIIIlIlIIIIlI> arrayDeque = new ArrayDeque<IIllIIllIIIlIlIIIIlI>();
        int n = 0;
        final Iterator<IIllIIllIIIlIlIIIIlI> iterator = deque.iterator();
        while (iterator.hasNext()) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = iterator.next();
            iterator.remove();
            if (n == 0 && illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() == ilIlIIIlIIlIlIIlllIl) {
                return arrayDeque;
            }
            arrayDeque.add(illIIllIIIlIlIIIIlI);
            if (illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() == IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI) {
                ++n;
            }
            if (illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() != IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl) {
                continue;
            }
            --n;
        }
        if (b) {
            throw new IlIlIIIIIIlllIlIllIl("Missing end token: " + ilIlIIIlIIlIlIIlllIl);
        }
        return arrayDeque;
    }
    
    private static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new IlIlIIIIIIlllIlIllIl(s);
        }
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[IlIlIIIlIIlIlIIlllIl.values().length];
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIlIlIlllllllllIl2[IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
