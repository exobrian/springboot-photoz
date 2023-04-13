package com.jetbrains.marco.photozclone.repository;

import com.jetbrains.marco.photozclone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}
