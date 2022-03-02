const fs = require("fs");
const CAMINHO_PAST = require("path");

const folder = process.argv[2];
const ext = "." + process.argv[3];

fs.readdir(folder, function (err, files) {
  if (err) return console.error(err);
  files.forEach(function (file) {
    if (CAMINHO_PAST.extname(file) === ext) {
      console.log(file);
    }
  });
});
