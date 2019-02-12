package com.herical.data;

import java.io.Serializable;

public interface MutableTree <N extends Serializable> extends Tree1<N> {
    boolean add (N parent, N node);
    boolean remove (N node, boolean cascade);
}
