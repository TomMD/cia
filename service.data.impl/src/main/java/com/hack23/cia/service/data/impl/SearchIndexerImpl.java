/*
 * Copyright 2010-2019 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.data.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.search.mapper.orm.Search;
import org.springframework.stereotype.Repository;

import com.hack23.cia.service.data.api.SearchIndexer;

/**
 * The Class SearchIndexerImpl.
 */
@Repository
final class SearchIndexerImpl implements SearchIndexer {

	/** The Constant TIMEOUT_IN_SECONDS. */
	private static final int TIMEOUT_IN_SECONDS = 900;

	/** The entity manager. */
	@PersistenceContext(name = "ciaPersistenceUnit")
	private EntityManager entityManager;

	/**
	 * Instantiates a new search indexer impl.
	 */
	public SearchIndexerImpl() {
		super();
	}

	@Override
	public void updateSearchIndex() throws InterruptedException {
		Search.getFullTextEntityManager(entityManager).createIndexer().transactionTimeout(TIMEOUT_IN_SECONDS).startAndWait();
	}
}