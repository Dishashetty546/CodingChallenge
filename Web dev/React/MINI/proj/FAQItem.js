/*extra objects from faq class from app.js */

const FAQItem = ({ faq, index }) => {
  return (
    <div className="faq-box">
      <div className="ques">
        <button></button>
        <div>(faq.question)</div>
        <div>{faq.answer}</div>
      </div>
    </div>
  );
};
export default FAQItem;
