package com.sravanth.repository;

import com.sravanth.exception.OwnerNotFoundException;

public interface OwnerRepository {
    String findOwner(int id) throws OwnerNotFoundException;
}
