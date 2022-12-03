## SpringBoot + Webflux + R2DBC + Mysql 
- [Reference1](https://godekdls.github.io/Spring%20Data%20R2DBC/contents/)
---
### Env
```text
- jdk 8
- kotlin
- spring 2.6.3
- spring reactive web
- r2dbc
- mysql 5.7
- coroutine
```
### Issue
1. [해결](https://github.com/mirromutth/r2dbc-mysql/issues/182)
```text
Message: No appropriate protocol (protocol is disabled or cipher suites are inappropriate)
```
2. [mysql timezone 설정](dev.miku.r2dbc.mysql.MySqlConnection     : The server timezone is <KST> that's unknown, trying to use system default timezone)
