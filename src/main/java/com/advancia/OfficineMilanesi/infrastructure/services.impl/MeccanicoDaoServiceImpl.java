package com.advancia.OfficineMilanesi.infrastructure.services.impl;

import com.advancia.OfficineMilanesi.domain.model.Meccanico;
import com.advancia.OfficineMilanesi.domain.repository.MeccanicoDaoService;
import com.advancia.OfficineMilanesi.infrastructure.dao.MeccanicoDao;
import com.advancia.OfficineMilanesi.infrastructure.exceptions.DBException;
import com.advancia.OfficineMilanesi.infrastructure.mappers.MeccanicoEntityMappers;
import com.advancia.OfficineMilanesi.infrastructure.model.MeccanicoEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MeccanicoDaoServiceImpl implements MeccanicoDaoService {
    @PersistenceContext
    private EntityManager em;
    @Inject
    private MeccanicoEntityMappers meccanicoEntityMappers;
    private final MeccanicoDao meccanicoDao = new MeccanicoDao();

    @Override
    public List<Meccanico> getAllMeccanici() {
        try {
            List<MeccanicoEntity> meccanici = meccanicoDao.getAllMeccanici(em);
            return meccanicoEntityMappers.convertFromEntity(meccanici);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare i meccanici.", e);
        }
    }

    @Override
    public Meccanico getMeccanicoById(long id) {
        try {
            MeccanicoEntity meccanicoEntity = meccanicoDao.getMeccanicoById(id, em);
            return meccanicoEntityMappers.convertFromEntity(meccanicoEntity);
        } catch(Exception e) {
            throw new DBException("Errore cercando di scaricare il meccanico con ID: " + id, e);
        }
    }

    @Override
    public void createMeccanico(Meccanico meccanico) {
        try {
            MeccanicoEntity meccanicoEntity = meccanicoEntityMappers.convertToEntity(meccanico);
            meccanicoDao.createMeccanico(meccanicoEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore durante la creazione del meccanico.", e);
        }
    }

    @Override
    public void updateMeccanico(long id, Meccanico meccanicoAgg) {
        try {
            MeccanicoEntity meccanicoEntity = meccanicoEntityMappers.convertToEntity(meccanicoAgg);
            meccanicoDao.updateMeccanico(id, meccanicoEntity, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di aggiornare il meccanico con ID: " + id, e);
        }
    }

    @Override
    public void deleteMeccanico(long id) {
        try {
            meccanicoDao.deleteMeccanico(id, em);
        } catch(Exception e) {
            throw new DBException("Errore cercando di eliminare il meccanico con ID: " + id, e);
        }
    }
}