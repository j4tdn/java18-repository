$(document).ready(function () {
  let container = $(".container");
  let blockInContainer = $("#block");
  let widthBlock = 150;
  let heightBlock = 150;
  let vericalPosY = $("#pos-y");
  let horizontalPosX = $("#pos-x");
  let size = $("#size");
  let opacity = $("#opacity");
  let shapeSeleted = $("#shape-select");
  let btnShapeOk = $("#ok-shape");
  let hexContainerText = $("#hex");
  let rgbaColorR = $("#rgba-r");
  let rgbaColorG = $("#rgba-g");
  let rgbaColorB = $("#rgba-b");
  let rgbaColorA = $("#rgba-a");

  vericalPosY.on("input", function () {
    let value = $(this).val();
    blockInContainer.css("top", value + "px");
  });

  horizontalPosX.on("input", function () {
    let value = $(this).val();
    blockInContainer.css("left", value + "px");
  });
  size.on("input", function () {
    let value = $(this).val();
    let widthNew = value * widthBlock;
    let heightNew = value * heightBlock;
    blockInContainer.css("width", widthNew + "px");
    blockInContainer.css("height", heightNew + "px");
  });
  opacity.on("input", function () {
    let value = $(this).val();
    blockInContainer.css("opacity", value);
  });
  btnShapeOk.on("click", function () {
    let shape = shapeSeleted.find(":selected").text();
    console.log(shape);
    if (shape === "Circle") {
      blockInContainer.removeClass("rhombus");
      blockInContainer.addClass("circle");
    } else if (shape === "Rhombus") {
      blockInContainer.removeClass("circle");
      blockInContainer.addClass("rhombus");
    } else if (shape === "Square") {
      blockInContainer.removeClass("circle");
      blockInContainer.removeClass("rhombus");
    }
  });
  hexContainerText.on("keydown", function (e) {
    let value = $(this).val();
    if (e.key == "Enter") {
      blockInContainer.css("background-color", "#" + value);
    }
  });
  rgbaColorR.on("input", function () {
    let r = parseInt($(this).val());
    let g = parseInt(rgbaColorG.val());
    let b = parseInt(rgbaColorB.val());
    let a = parseFloat(rgbaColorA.val()); 
    blockInContainer.css("background-color", `rgba(${r},${g},${b},${a})`);
  });
  rgbaColorG.on("input", function () {
    let g = parseInt($(this).val());
    let r = parseInt(rgbaColorR.val());
    let b = parseInt(rgbaColorB.val());
    let a = parseFloat(rgbaColorA.val()); 
    blockInContainer.css("background-color", `rgba(${r},${g},${b},${a})`);
  });
  rgbaColorB.on("input", function () {
    let b = parseInt($(this).val());
    let g = parseInt(rgbaColorG.val());
    let r = parseInt(rgbaColorR.val());
    let a = parseFloat(rgbaColorA.val()); 
    blockInContainer.css("background-color", `rgba(${r},${g},${b},${a})`);
  });
  rgbaColorA.on("input", function () {
    let a = parseFloat($(this).val());
    let g = parseInt(rgbaColorG.val());
    let b = parseInt(rgbaColorB.val());
    let r = parseInt(rgbaColorR.val()); 
    blockInContainer.css("background-color", `rgba(${r},${g},${b},${a})`);
  });
});
