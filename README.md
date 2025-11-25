Sistema de Gerenciamento de Usuários

Descrição do Projeto

Sistema de gerenciamento de usuários desenvolvido em Spring Boot com Gradle com funcionalidades completas de cadastro, autenticação JWT e gestão de dados de usuários, incluindo endereços e telefones.

Tecnologias Utilizadas

· Java + Spring Boot
· Gradle (Gerenciamento de dependências)
· Spring Security + JWT
· PostgreSQL
· JPA/Hibernate
· Lombok

Funcionalidades

Gestão de Usuários

· Cadastro de novos usuários
· Login com autenticação JWT
· Busca de usuário por email
· Atualização de dados do usuário
· Exclusão de usuário por email

Gestão de Endereços

· Cadastro de endereços vinculados ao usuário
· Atualização de endereços existentes

Gestão de Telefones

· Cadastro de telefones vinculados ao usuário
· Atualização de telefones existentes

Segurança

· Autenticação via JWT (JSON Web Token)
· Senhas criptografadas com BCrypt
· Filtro JWT para validação de requisições
· Configuração de segurança com Spring Security

Exceções Customizadas

· ConflictExceptions - Para conflitos (ex: email já cadastrado)
· ResourceNotFoundException - Para recursos não encontrados

Notas Importantes

· Todas as requisições (exceto login e cadastro) requerem token JWT no header:
  ```
  Authorization: Bearer {token}
  ```
· As senhas são automaticamente criptografadas antes do armazenamento
· O sistema valida emails duplicados durante o cadastro
· Relacionamentos: Um usuário pode ter múltiplos endereços e telefones

Autor

Desenvolvido por Guilherme - Sistema completo de gerenciamento de usuários com segurança JWT usando Gradle.
