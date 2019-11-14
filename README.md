### Before starting
Create a MYSQL Database with following settings:
- username: `root`
- password: ` ` (empty)

Execute the following SQL Command on MySQL Server
```$xslt
CREATE DATABASE id_demo;
```

### Api Call Example
```$shell
curl -X POST \
  http://localhost:8080/register \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 96' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 364b13d2-cbe2-49e0-85d9-7373c2e3f32c,cb315653-b428-451d-9a4c-01698312f023' \
  -H 'User-Agent: PostmanRuntime/7.19.0' \
  -H 'cache-control: no-cache' \
  -d '{
    "email": "marko@zanoski.com",
    "password": "123123",
    "phoneNumber": "21332",
    "identifier": "@twitterhandle"
}'
```
