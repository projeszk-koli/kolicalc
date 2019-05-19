const express = require('express');
const app = express();

app.use(express.static(__dirname + '/dist/kolicalc-frontend'));

/* app.get('/*', function(req, res) {
 res.sendFile(__dirname + '/dist/kolicalc-frontend/index.html');
}); */

app.listen(process.env.PORT || 4200);
console.log('SERVER RUNNING...');