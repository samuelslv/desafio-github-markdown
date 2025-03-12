# desafio-github-markdown do DIO

# Guia Rápido de Comandos do GitHub

Este documento lista os principais comandos utilizados no GitHub para controle de versão e gestão de repositórios.

## Configuração Inicial
```sh
# Configurar nome de usuário e e-mail
git config --global user.name "Seu Nome"
git config --global user.email "seuemail@example.com"

# Verificar configuração
git config --list
```

## Trabalhando com Repositórios
```sh
# Clonar um repositório
git clone URL_DO_REPOSITORIO

# Criar um novo repositório
git init
```

## Controle de Versão
```sh
# Verificar status do repositório
git status

# Adicionar arquivos para staging
git add arquivo.txt  # Adiciona um arquivo
git add .            # Adiciona todos os arquivos

# Criar um commit
git commit -m "Mensagem do commit"
```

## Trabalhando com Branches
```sh
# Criar uma nova branch
git branch nome-da-branch

# Listar branches
git branch

# Alternar entre branches
git checkout nome-da-branch

# Criar e trocar para uma nova branch
git checkout -b nome-da-branch
```

## Sincronização com o GitHub
```sh
# Adicionar repositório remoto
git remote add origin URL_DO_REPOSITORIO

# Enviar commits para o GitHub
git push origin nome-da-branch

# Atualizar repositório local
git pull origin nome-da-branch
```

## Resolvendo Conflitos
```sh
# Verificar diferenças entre arquivos
git diff

# Resolver conflitos manualmente e adicionar alterações
git add arquivo_resolvido.txt

git commit -m "Conflito resolvido"
```

## Histórico e Reversão
```sh
# Verificar histórico de commits
git log

# Reverter para um commit anterior
git checkout HASH_DO_COMMIT

# Resetar um commit mantendo alterações
git reset --soft HASH_DO_COMMIT

# Resetar um commit descartando alterações
git reset --hard HASH_DO_COMMIT
```

## Outros Comandos Úteis
```sh
# Remover arquivos do controle de versão
git rm --cached arquivo.txt

# Stash para salvar alterações temporariamente
git stash

# Aplicar alterações salvas no stash
git stash pop
```

## Conclusão
Estes são alguns dos principais comandos do Git/GitHub. Para mais informações, utilize `git help comando`.

