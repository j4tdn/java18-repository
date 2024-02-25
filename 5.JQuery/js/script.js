$(document).ready(function () {
  let btnToggle = $(".btn-toggle");
  let blockToggle = $(".block-toggle");
  let thumbnail = $(".avatar-thumbnail");

  btnToggle.on("click", function () {
    blockToggle.toggleClass("invisible");
  });
  
  let fc = $(".avatar-fc");
  fc.on("change", function () {
    let fr = new FileReader();
    let loadingFiles = this.files;
    let selectedFiles = loadingFiles[0];

    //load/copy file content from local to web browser
    if (selectedFiles) {
      console.log(1);
      fr.readAsDataURL(selectedFiles);
    }
    //after loading success
    //set to thumbnail
    fr.onload = function (e) {
      thumbnail.attr("src", e.target.result);
    };
  });
  let trigger = $(".trigger");
  trigger.on("click", function () {
    fc.click();
  });
  let reset = $(".reset");
  reset.on("click", function () {
    thumbnail.attr("src", "images/defaultAvatar.png");
  });
});
// load image for form
