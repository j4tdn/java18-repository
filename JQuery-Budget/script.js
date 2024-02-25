$(document).ready(() => {
  let desc = $(".add__description");
  let value = $(".add__value");
  let btnAdd = $(".add__btn");
  let incomeList = $(".income__list");
  let expenseList = $(".expenses__list");
  let selected = $(".add__type");
  let percentExpense = $(".budget__expenses--percentage");
  let income_i = 0;
  let expense_j = 0;
  let valueTotalCurrent = 0;
  let valueIncomeCurrent = 0;
  let valueExpenseCurrent = 0;
  let profitCurrent = $(".budget__value");
  let totalIncomeCurrent = $(".budget__income--value");
  let totalExpenseCurrent = $(".budget__expenses--value");
  profitCurrent.text("");
  totalIncomeCurrent.text("");
  totalExpenseCurrent.text("");
  percentExpense.text("%");
  btnAdd.on("click", () => {
    if (!desc.val() && value.val()) {
      alert("Description field is not empty!");
    } else if (!value.val() && desc.val()) {
      alert("Value field is not empty!");
    } else if (!(value.val() && desc.val())) {
      alert("Description and Value field is not empty!");
    } else {
      let valueElementExpense = $("<div></div>");
      if (selected.find(":selected").val() == "inc") {
        let incomeElement = $("<div></div>");
        let descElement = $("<p></p>");
        let valueElement = $("<div></div>");
        let content = $("<p></p>");
        descElement.text(desc.val());
        descElement.css("width", "60%");
        descElement.css("margin-left", "10px");
        content.text(
          "+" +
            parseFloat(value.val())
              .toFixed(2)
              .replace(/\d(?=(\d{3})+\.)/g, "$&,")
        );
        content.css("color", "#28B9B5");
        content.css("float", "right");
        content.css("margin-right", "10px");
        valueElement.css("width", "40%");
        valueElement.append(content);
        incomeElement.append(descElement);
        incomeElement.append(valueElement);
        incomeElement.attr("id", "income" + income_i);
        incomeElement.css("width", "100%");
        incomeElement.css("height", "50px");
        incomeElement.css("border-top", "1px solid #e7e7e7");
        incomeElement.css("border-bottom", "1px solid #e7e7e7");
        incomeElement.css("margin-right", "50px");
        incomeElement.css("display", "flex");
        incomeElement.css(
          "background-color",
          income_i % 2 == 1 ? "#e7e7e7" : ""
        );
        incomeElement.css("align-items", "center");
        incomeList.append(incomeElement);
        valueIncomeCurrent += parseFloat(value.val());
        income_i++;
      } else if (selected.find(":selected").val() === "exp") {
        let expenseElement = $("<div></div>");
        let descElement = $("<p></p>");

        let content = $("<p></p>");
        descElement.text(desc.val());
        descElement.css("width", "60%");
        descElement.css("margin-left", "10px");
        content.text(
          "-" +
            parseFloat(value.val())
              .toFixed(2)
              .replace(/\d(?=(\d{3})+\.)/g, "$&,")
        );
        content.css("color", "#FF5049");
        content.css("float", "right");
        content.css("margin-right", "10px");
        valueElementExpense.css("width", "40%");
        valueElementExpense.css("display", "flex");
        valueElementExpense.css("justify-content", "end");
        valueElementExpense.css("align-items", "center");
        valueElementExpense.append(content);
        expenseElement.append(descElement);
        expenseElement.append(valueElementExpense);
        expenseElement.attr("id", "expense" + expense_j);
        expenseElement.css("width", "100%");
        expenseElement.css("height", "50px");
        expenseElement.css("border-top", "1px solid #e7e7e7");
        expenseElement.css("border-bottom", "1px solid #e7e7e7");
        expenseElement.css("margin-right", "50px");
        expenseElement.css("display", "flex");
        expenseElement.css(
          "background-color",
          expense_j % 2 == 1 ? "#e7e7e7" : ""
        );
        expenseElement.css("align-items", "center");
        expenseList.append(expenseElement);
        valueExpenseCurrent += parseFloat(value.val());
        expenseElement.on("mouseenter ", () => {
          let cancel = $("<span></span>");
          cancel.attr("class", "cancel");
          cancel.text("X");
          cancel.css("border", "1px solid #FF5049");
          cancel.css("border-radius", "90%");
          cancel.css("color", "#FF5049");
          cancel.css("cursor", "pointer");
          cancel.css("margin-right", "10px");
          valueElementExpense.append(cancel);
          cancel.on("click", (e) => {
            $(e.target).parent().parent().remove();
            valueExpenseCurrent += parseFloat(
              $(e.target).prevAll().last().text().replace(/,/g, "")
            );
            totalExpenseCurrent.text(
              "-" +
                parseFloat(valueExpenseCurrent)
                  .toFixed(2)
                  .replace(/\d(?=(\d{3})+\.)/g, "$&,")
            );
            percentExpense.text(
              ((valueExpenseCurrent / valueIncomeCurrent) * 100).toFixed(2) +
                "%"
            );
            valueTotalCurrent = valueIncomeCurrent - valueExpenseCurrent;
            profitCurrent.text(
              (valueTotalCurrent < 0 ? "" : "+") +
                parseFloat(valueTotalCurrent)
                  .toFixed(2)
                  .replace(/\d(?=(\d{3})+\.)/g, "$&,")
            );
          });
        });
        expenseElement.on("mouseleave ", () => {
          valueElementExpense.find(".cancel").remove();
        });

        let percentExpenseElement = $("<p></p>");
        let thisPercentExpense = (
          (parseFloat(value.val()) / valueIncomeCurrent) *
          100
        ).toFixed(2);
        percentExpenseElement.text(thisPercentExpense + "%");
        percentExpenseElement.css("background-color", "gray");
        percentExpenseElement.css("padding", "2px");
        percentExpenseElement.css("border-radius", "5px");
        percentExpenseElement.css("margin-right", "10px");
        valueElementExpense.append(percentExpenseElement);
        expense_j++;
      }
      selected.val("inc");
      valueTotalCurrent = valueIncomeCurrent - valueExpenseCurrent;
      let percent = ((valueExpenseCurrent / valueIncomeCurrent) * 100).toFixed(
        2
      );
      percentExpense.text(percent + "%");

      totalIncomeCurrent.text(
        "+" +
          parseFloat(valueIncomeCurrent)
            .toFixed(2)
            .replace(/\d(?=(\d{3})+\.)/g, "$&,")
      );
      totalExpenseCurrent.text(
        "-" +
          parseFloat(valueExpenseCurrent)
            .toFixed(2)
            .replace(/\d(?=(\d{3})+\.)/g, "$&,")
      );
      profitCurrent.text(
        (valueTotalCurrent < 0 ? "" : "+") +
          parseFloat(valueTotalCurrent)
            .toFixed(2)
            .replace(/\d(?=(\d{3})+\.)/g, "$&,")
      );

      // update percent expense each element after add income or expense element.
      Array.from(expenseList.children()).forEach(element => {
        let elementPercent =$($(element).children()[1]).children()[1];
        let elementPrice=$($(element).children()[1]).children()[0];
        let price = parseFloat($(elementPrice).text().replace(/,/g, "").replace('-',''));
        console.log(price);
        console.log(valueIncomeCurrent);
        $(elementPercent).text((price/valueIncomeCurrent*100).toFixed(2)+"%")
      });
    }
    desc.val("");
    value.val("");
  });
});
