# Errors and Exception faced.

**org.hibernate.id.IdentifierGenerationException: Identifier of entity 'com.lcwd.rating.service.entity.Rating' must be manually assigned before calling 'persist()'**

This error typically occurs in Spring Data JPA applications when you're trying to persist an entity that has an auto-generated ID field (usually annotated with @Id and @GeneratedValue) but haven't configured the ID generation strategy correctly.
