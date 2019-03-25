package com.pau_pau.project.data.services;

import com.pau_pau.project.data.models.DirectorDTO;

import javax.management.InstanceNotFoundException;

public interface DirectorsService {
    Iterable<DirectorDTO> findDirectors(String name,
                                        String country);

    DirectorDTO findDirectorById(int id) throws InstanceNotFoundException;

    DirectorDTO addDirector(DirectorDTO director);

    DirectorDTO updateDirector(int id, DirectorDTO director) throws InstanceNotFoundException;

    DirectorDTO deleteDirectorById(int id) throws InstanceNotFoundException;
}
