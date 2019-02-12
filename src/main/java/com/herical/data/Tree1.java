package com.herical.data;

import java.io.Serializable;
import java.util.List;

public interface Tree1 <N extends Serializable> extends Serializable {
    List<N> getRoots ();
    N getParent (N node);
    List<N> getChildren (N node);
}
