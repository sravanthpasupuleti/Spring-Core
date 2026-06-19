package com.sravanth.service;

import com.sravanth.exception.OwnerNotFoundException;

public interface OwnerService {
    String findOwner() throws OwnerNotFoundException;

    void modifyId(int ownerId);
}
