 
#curl -v -H "Content-Type: application/json" -X PUT --data "@388.json" -u login:password http://redmine/issues/388.json
#curl -v -H "Content-Type: application/json" -X PUT --data "@388.json" -H "X-Redmine-API-Key: xxxx" http://redmine/issues/388.json
 
 # Component already exists 
curl -X PUT -F "afile=@/home/jesus/bento_server/test.zip" http://localhost:4567/component/my_new_component 

# curl -F "userid=1" -F "filecomment=This is an image file" -F "image=@/home/user1/Desktop/test.jpg" 