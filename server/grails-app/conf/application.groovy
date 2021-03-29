

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.djamware.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.djamware.UserAuthority'
grails.plugin.springsecurity.authority.className = 'com.djamware.Authority'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
		[pattern: '/h2-console/**',  access: ['permitAll']],
		[pattern: '/',               access: ['permitAll']],
		[pattern: '/error',          access: ['permitAll']],
		[pattern: '/index',          access: ['permitAll']],
		[pattern: '/index.gsp',      access: ['permitAll']],
		[pattern: '/shutdown',       access: ['permitAll']],
		[pattern: '/assets/**',      access: ['permitAll']],
		[pattern: '/**/js/**',       access: ['permitAll']],
		[pattern: '/**/css/**',      access: ['permitAll']],
		[pattern: '/**/images/**',   access: ['permitAll']],
		[pattern: '/**/favicon.ico', access: ['permitAll']],
		[pattern: '/api/login',      access: ['permitAll']],
		[pattern: '/api/logout',     access: ['isFullyAuthenticated()']],
		[pattern: '/customer',       access: ['isFullyAuthenticated()']],
		[pattern: '/**',             access: ['isFullyAuthenticated()']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
		[pattern: '/h2-console/**',  filters: 'none'],
		[pattern: '/assets/**',      filters: 'none'],
		[pattern: '/**/js/**',       filters: 'none'],
		[pattern: '/**/css/**',      filters: 'none'],
		[pattern: '/**/images/**',   filters: 'none'],
		[pattern: '/**/favicon.ico', filters: 'none'],
		[pattern: '/api/**', 		 filters:'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter'],
		[pattern: '/**', 			 filters:'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'],
		// [pattern: '/**',             filters: 'JOINED_FILTERS']
]


grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
grails.plugin.springsecurity.rest.token.storage.memcached.hosts = 'localhost:11211'
grails.plugin.springsecurity.rest.token.storage.memcached.username = 'admin'
grails.plugin.springsecurity.rest.token.storage.memcached.password = 'admin'
grails.plugin.springsecurity.rest.token.storage.memcached.expiration = 86400

