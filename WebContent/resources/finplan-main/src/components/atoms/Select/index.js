import S from "./styles.module.scss";

const Select = ({ values, label, placeholder, children }) => {
  const onChangeSelect = (select) => {
    values = select.target.value;
  };

  return (
    <div className={S.container}>
      <select className={S.select} onChange={onChangeSelect}>
        {children}
      </select>
      <label className={S.label}>{label}</label>
    </div>
  );
};

export default Select;
