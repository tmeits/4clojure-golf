#(apply hash-map(mapcat(fn[[k v]][k(count v)])(group-by identity%)))