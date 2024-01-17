package com.backendestudiantes.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.backendestudiantes.model.EstudianteModel;
import com.backendestudiantes.repository.EstudianteRepository;


@Service
public class EstudianteService implements EstudianteRepository {
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends EstudianteModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<EstudianteModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstudianteModel getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteModel getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteModel getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteModel> List<S> findAll(Example<S> example, Sort sort) {

		return null;
	}

	@Override
	public <S extends EstudianteModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EstudianteModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstudianteModel> findAll() {
		return estudianteRepository.findAll();
	}

	@Override
	public <S extends EstudianteModel> S save(S entity) {
		
		return estudianteRepository.save(entity);
	}

	@Override
	public Optional<EstudianteModel> findById(Long id) {
		
		return estudianteRepository.findById(id);
	}

	
	@Override
	public void deleteById(Long id) {
		
		estudianteRepository.deleteById(id);
		
	}
	
	@Override
	public void delete(EstudianteModel entity) {
		// TODO Auto-generated method stub
		estudianteRepository.delete(entity);
	}
	@Override
	public void deleteAll() {
		estudianteRepository.deleteAll();
		
	}
	
	@Override
	public List<EstudianteModel> findAll(Sort sort) {
		
		return estudianteRepository.findAll(sort);
	}
	
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends EstudianteModel> entities) {
		// TODO Auto-generated method stub
		
	}

	



	@Override
	public Page<EstudianteModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends EstudianteModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends EstudianteModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends EstudianteModel, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
