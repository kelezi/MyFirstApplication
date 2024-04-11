package com.example.demo.service;

import com.example.demo.entities.PersonPhone;
import com.example.demo.repository.PersonPhoneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonPhoneService {
    @Autowired
    PersonPhoneRepository repository;

    public List<PersonPhone> getAllPersonPhone(Integer id){
        return repository.getPersonPhone(id);
    }

    @Transactional// kur kemi te bejme me modifikim ose inserim te dhenash
    //perdorim kete annotation nqs ndodh ndonje error e kthen db ne gjendjen e meparshme
    public void savePersonPhone(PersonPhone personPhone){
        repository.save(personPhone);
    }
    @Transactional
    public void updatePersonPhone(PersonPhone personPhone){
        repository.updatePhoneById(personPhone.getPhonenumber(),
                personPhone.getPhonenumbertypeid(), personPhone.getModifieddate(),
                personPhone.getBusinessentityid());
    }
}
